package main;

import java.util.ArrayList;
import java.util.List;
 
class Student {
     private String name;
     private int age;
 
     Student(String name, int age) {
         this.name = name;
         this.age = age;
     }
 
     public String toString() {
         return "Student[" + name + ", " + age + "]";
     }
}
 
public class Teste7 {
     public static void main(String[] args) {
         List<Student> students = new ArrayList<>();
         students.add(new Student("James", 25));
         students.add(new Student("James", 27));
         students.add(new Student("James", 25));
         students.add(new Student("James", 25));
 
         students.remove(new Student("James", 25));
 
         for(Student stud : students) {
             System.out.println(stud);
         }
     }
}