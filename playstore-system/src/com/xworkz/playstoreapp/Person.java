package com.xworkz.playstoreapp;

public class Person {
    String name;
    int age;

    public void display(String name, int age) {
        System.out.println("name " + name + "age : " + age);
    }
}

   class  Student extends  Person {
      String studentId;

      public void display(String name, int age, String stdId) {
          System.out.println("name " + name + "age : " + age + "Student Id :  " + studentId);
      }

  }
class Main{

    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new  Student();
        std1.display("joy", 12);
        std2.display("joy", 12, "1234");
    }
}