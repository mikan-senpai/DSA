package com.mikan.staticExample;

public class Human {
  int age;
  String name;
  int salary;

  // making population static because the varible is not depenent on the object
  static long population;

  static void message() {
    System.out.println("this is a static method");
  }

  public Human(int age, String name, int salary) {
    this.age = age;
    this.name = name;
    this.salary = salary;
    Human.population += 1; // we can do this here too -> (this.population) but this is convention ->
                           // (Human.population)
    // teh static variables and the methods belong to the class not the object


//  i can call this static class without creating an instance
    Human.message();

  }


}

