package com.j2.w3;
import java.util.Date;
import com.sd.turtle.WeightTurtle;

public class SorterMainV2 {
    public static void main(String[] args) {
        
        WeightTurtle wt30 = new WeightTurtle(30);
        WeightTurtle wt10 = new WeightTurtle(10);
        WeightTurtle wt20 = new WeightTurtle(20);
        WeightTurtle[] wts={wt30, wt10, wt20};
        Comparator turtleComp=new TurtleComparator();
        Sorter.sort(wts, turtleComp);

        for(int i=0; i<wts.length; i++)
            System.out.println("WeightTurtleArray["+i+"]="+wts[i].getWeight());
        
        Date eunju = new Date(1996,3,10);
        Date subin = new Date(1996,5,25);
        Date[] day={eunju,subin};
        Comparator datecomp= new DateComparator();
        Sorter.sort(day,datecomp);
        
        for(int i=0; i<day.length; i++)
            System.out.println("DateArray["+i+"]="+day[i]);
        
        String[] B={"a","b","c","d"};
        Comparator stringComp=new StringComparator();
        Sorter.sort(B,stringComp);
      
    }
}

class Sorter {
  public Sorter() {}
    public static void sort(Object[] data, Comparator comp) {
        for(int i=data.length-1; i>=1; i--) {
            int indexOfMax=0;
            for(int j=1; j<=i; j++) {
                if(comp.compare(data[j], data[indexOfMax]) > 0)
                    indexOfMax=j;
                }
                Object temp=data[i];
                data[i]=data[indexOfMax];
                data[indexOfMax]=temp;
        }
    }
}


interface Comparator {
    public int compare(Object o1, Object o2);
    public boolean equals(Object o);
}


class TurtleComparator implements Comparator {
    public int compare(Object t1, Object t2) {
        return ((WeightTurtle)t1).getWeight()-((WeightTurtle)t2).getWeight();
    }
}

class DateComparator implements Comparator { 
     public DateComparator() {} 
     public int compare(Object o1, Object o2) { 
       return ((Date) o1).compareTo((Date) o2); 
     } 
 } 

class StringComparator implements Comparator {
    public StringComparator() {}
    public int compare(Object o1, Object o2) {
        String s1 = (String)o1;
        String s2 = (String)o2;
        return s1.compareTo(s2);
        //return Integer.parseInt((String) o1) -
        //   Integer.parseInt((String) o2);
    }
}


class ReverseComparator implements Comparator {
    private final Comparator c;
    public ReverseComparator(Comparator c) {this.c = c; }
    public int compare(Object o1, Object o2) {
        return c.compare(o2, o1);
    }
}