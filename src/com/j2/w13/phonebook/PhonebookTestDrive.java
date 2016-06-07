package com.j2.w13.phonebook;

public class PhonebookTestDrive{
  public static void main(String[] args){
    People people = new PeopleDao();
    
    for(Person person : people.getPeople()){
      System.out.println("Person No."+person.getNum()+" Name :"+person.getName());
    }
    System.out.println();
    
    System.out.println("Change No.1");
    Person person=people.getPeople().get(1);
    person.setName("Chris");
    people.insertPerson(person);
    
    people.getPerson(1);
    System.out.println("Person No."+person.getNum()+" Name "+person.getName());
    System.out.println();
    
    System.out.println("Delete No.3");
    person = people.getPeople().get(3);
    people.deletePerson(person);
  }
}