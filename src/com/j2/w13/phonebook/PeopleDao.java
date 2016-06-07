package com.j2.w13.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PeopleDao implements People{
  List<Person> manyp;
  
  public PeopleDao(){
    manyp = new ArrayList<Person>();
    Person p1=new Person("Oheunju",0);
    Person p2=new Person("Mickey",1);
    Person p3=new Person("Pinn",2);
    Person p4=new Person("Jake",3);
    
    manyp.add(p1);
    manyp.add(p2);
    manyp.add(p3);
    manyp.add(p4);
  }
  public List<Person> getPeople(){
    return manyp;
  }
  public Person getPerson(int num){
    return manyp.get(num);
  }
  public void insertPerson(Person person){
    manyp.get(person.getNum()).setName(person.getName());
    System.out.println("Person No. "+person.getNum()+" inserted");
  }
  public void deletePerson(Person person){
    manyp.remove(person.getNum());
    System.out.println("Person No."+person.getNum()+" deleted.");
  }
}
    
    