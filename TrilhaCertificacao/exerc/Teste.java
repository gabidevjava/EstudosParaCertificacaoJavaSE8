public class Test {
     public static void main(String[] args) {
         LocalTime time = LocalTime.of(16, 40);
         String amPm = time.getHour() >= 12 ? (time.getHour() == 12) ? "PM" : "AM";
         System.out.println(amPm);
     }
}
-------------------------------------------------------------------------------------------------

abstract class Super {
     public abstract void m1() throws IOException;
}
 
class Sub extends Super {
     @Override
     public void m1() throws IOException {
         throw new FileNotFoundException();
     }
}
 
public class Test {
     public static void main(String[] args) {
         Super s = new Sub();
         try {
             s.m1();
         } catch (FileNotFoundException e) {
             System.out.print("M");
         } finally {
             System.out.print("N");
         }
     }
}

---------------------------------------------------------------------------------------------------

public class Test {
     public static void main(String[] args) {
         byte var = 100;
         switch(var) {
             case 100:
                 System.out.println("var is 100");
                 break;
             case 200:
                 System.out.println("var is 200");
                 break;
             default:
                 System.out.println("In default");
         }
     }
}

---------------------------------------------------------------------------------------------------

public class Test {
     public static void main(String[] args) {
         double price = 90000;
         String model;
         if(price > 100000) {
             model = "Tesla Model X";
         } else if(price <= 100000) {
             model = "Tesla Model S";
         }
           System.out.println(model);
     }
}

---------------------------------------------------------------------------------------------------

public class Test {
     public static void main(String[] args) {
         System.out.println("Output is: " + 10 != 5);
     }
}

--------------------------------------------------------------------------------------------------

public class Test {
     public static void main(String[] args) {
         String [] fruits = {"apple", "banana", "mango", "orange"};
         for(String fruit : fruits) {
             System.out.print(fruit + " ");
             if(fruit.equals("mango")) {
                 continue;
             }
             System.out.println("salad!");
             break;
         }        
     }
}

----------------------------------------------------------------------------------------------------

public class Test {
     public static void main(String[] args) {
         String [] arr = {"A", "B", "C", "D", "E"};
         for(/*INSERT*/) {
             System.out.print(arr[n]);
         }
     }
}

-----------------------------------------------------------------------------------------------------

class Message {
     static void main(String [] args) {
         System.out.println("Welcome! " + args[1]);
     }
}
 
public class Guest {
     public static void main(String [] args) {
         Message.main(args);
     }
}
is not public 
------------------------------------------------------------------------------------------------------

public class Test {
     public static void main(String[] args) {
         int [] arr = {2, 1, 0};
         for(int i : arr) {
             System.out.println(arr[i]);
         }
     }
}

-----------------------------------------------------------------------------------------------------

public class Test {
     private static void m(int x) {
         System.out.println("int version");
     }
 
     private static void m(char x) {
         System.out.println("char version");
     }
 
     public static void main(String [] args) {
         int i = '5';
         m(i);
         m('5');
     }
}

-------------------------------------------------------------------------------------------------------

public class Test {
     public static void main(String[] args) {
         List<Character> list = new ArrayList<>();
         list.add(0, 'V');
         list.add('T');
         list.add(1, 'E');
         list.add(3, 'O');
 
         if(list.contains('O')) {
             list.remove('O');
         }
 
         for(char ch : list) {
             System.out.print(ch);
         }
     }
}

------------------------------------------------------------------------------------------------------

public class Test {
     public static void main(String[] args) {
         try {
             main(args);
         } catch (Exception ex) {
             System.out.println("CATCH-");
         }
             System.out.println("OUT");
     }
}

------------------------------------------------------------------------------------------------------

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
 
public class Test {
     public static void main(String [] args) {
         LocalDate date = LocalDate.of(2012, 1, 11);
         Period period = Period.ofMonths(2);
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy");
         System.out.print(formatter.format(date.minus(period)));
     }
}

-----------------------------------------------------------------------------------------------------

public class A {
     public void print() {
         System.out.println("A");
     }
}
 
//B.java
package com.udayan.oca;
 
public class B extends A {
     public void print() {
         System.out.println("B");
     }
}
 
//Test.java
package com.udayan.oca.test;
 
import com.udayan.oca.*;
 
public class Test {
     public static void main(String[] args) {
         A obj1 = new A();
         B obj2 = (B)obj1;
         obj2.print();
     }
}

-------------------------------------------------------------------------------------------------------

