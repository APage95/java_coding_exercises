package com.techreturners.exercise002;

public class Person {

   private String forename;
   private String surname;
   private String city;
   private int age;

  public Person (String forename, String surname, String city, int age) {
      this.forename = forename;
      this.surname = surname;
      this.city = city;
      this.age = age; }

  public String getForename(){return forename;}
  public String getSurname(){return surname;}
  public String getCity(){return city;}
  public int getAge(){return age;}

}
