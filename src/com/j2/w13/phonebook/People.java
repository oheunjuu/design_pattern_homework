package com.j2.w13.phonebook;

import java.util.List;

public interface People{
  public List<Person> getPeople();
  public Person getPerson(int num);
  public void insertPerson(Person person);
  public void deletePerson(Person person);
}