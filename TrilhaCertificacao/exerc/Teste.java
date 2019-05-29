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

package com.udayan.oca;
 
import java.util.ArrayList;
import java.util.List;
 
public class Test {
     public static void main(String[] args) {
         List<String> list1 = new ArrayList<>();
         list1.add("A");
         list1.add("D");
 
         List<String> list2 = new ArrayList<>();
         list2.add("B");
         list2.add("C");
 
         list1.addAll(1, list2);
 
         System.out.println(list1);
     }
}

------------------------------------------------------------------------------------------------------

abstract class Animal {
     private String name;
 
     Animal(String name) {
        this.name = name;
     }
 
     public String getName() {
         return name;
     }
}
 
class Dog extends Animal {
     private String breed;
     Dog(String breed) {
         this.breed = breed;
     }
 
     Dog(String name, String breed) {
         super(name);
         this.breed = breed;
     }
 
     public String getBreed() {
         return breed;
     }
}
 
public class Test {
     public static void main(String[] args) {
         Dog dog1 = new Dog("Beagle");
         Dog dog2 = new Dog("Bubbly", "Poodle");
         System.out.println(dog1.getName() + ":" + dog1.getBreed() + ":" + 
                             dog2.getName() + ":" + dog2.getBreed());
     }
}

---------------------------------------------------------------------------------------------------

public class Test {
     public static void main(String[] args) {
         String str = "java";
         StringBuilder sb = new StringBuilder("java");
 
         System.out.println(str.equals(sb) + ":" + sb.equals(str));
     }
}

--------------------------------------------------------------------------------------------------

public class Test {
     public static void main(String[] args) {
         double [] arr = new int[2]; //Line 3
         System.out.println(arr[0]); //Line 4
     }
}

-------------------------------------------------------------------------------------------------

class PenDrive {
     int capacity;
     PenDrive(int capacity) {
         this.capacity = capacity;
     }
}
 
class OTG extends PenDrive {
     String type;
     OTG(int capacity, String type) {
         //TODO
     }
}
 
public class Test {
     public static void main(String[] args) {
         OTG obj = new OTG(64, "TYPE-C");
         System.out.println(obj.capacity + ":" + obj.type);
     }
}

-----------------------------------------------------------------------------------------------------

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
 
public class Test {
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

----------------------------------------------------------------------------------------------------

public class Test {
     public static void main(String[] args) {
         String str1 = new String("Core");
         String str2 = new String("CoRe");
         System.out.println(str1 = str2);
     }
}

----------------------------------------------------------------------------------------------------

public class Test {
     public static void main(String [] args) {
         LocalDateTime obj = LocalDateTime.now();
         System.out.println(obj.getSecond());
     }
}

----------------------------------------------------------------------------------------------------

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
 
public class Test {
     public static void main(String[] args) {
         List<LocalDate> dates = new ArrayList<>();
         dates.add(LocalDate.parse("2018-07-11"));
         dates.add(LocalDate.parse("1919-02-25"));
         dates.add(LocalDate.of(2020, 4, 8));
         dates.add(LocalDate.of(1980, Month.DECEMBER, 31));
 
         dates.removeIf(x -> x.getYear() < 2000);
 
         System.out.println(dates);
     }
}

----------------------------------------------------------------------------------------------------

import java.time.LocalDate;
 
public class Test {
     public static void main(String [] args) {
          LocalDate date = LocalDate.of(2020, 9, 31);
          System.out.println(date);
     }
}

-----------------------------------------------------------------------------------------------------

class Point {
     int x;
     int y;
     void assign(int x, int y) {
         x = this.x;
         this.y = y;
     }
 
     public String toString() {
         return "Point(" + x + ", " + y + ")";
     }
}
 
public class Test {
     public static void main(String[] args) {
         Point p1 = new Point();
         p1.x = 10;
         p1.y = 20;
         Point p2 = new Point();
         p2.assign(p1.x, p1.y);
         System.out.println(p1.toString() + ";" + p2.toString());
     }
}

-----------------------------------------------------------------------------------------------------

import java.time.Period;
 
public class Test {
     public static void main(String [] args) {
         Period period = Period.of(0, 0, 0);
         System.out.println(period);
     }
}

-----------------------------------------------------------------------------------------------------

mport java.time.LocalDate;
 
public class Test {
    public static void main(String [] args) {
        LocalDate newYear = LocalDate.of(2018, 1, 1);
        LocalDate christmas = LocalDate.of(2018, 12, 25);
        boolean flag1 = newYear.isAfter(christmas);
        boolean flag2 = newYear.isBefore(christmas);
        System.out.println(flag1 + ":" + flag2);
    }
}

-----------------------------------------------------------------------------------------------------

public class Test {
     public static void main(String[] args) {
         /*INSERT*/
         switch(var) {
             case 7:
                 System.out.println("Lucky no. 7");
                 break;
             default:
                 System.out.println("DEFAULT");
         }
     }
}

-----------------------------------------------------------------------------------------------------

public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(100);
        System.out.println(sb.length() + ":" + sb.toString().length());
    }
}

-----------------------------------------------------------------------------------------------------

public class Test {
     public static void main(String [] args) {
         int a = 100;
         System.out.println(-a++);
     }
}

-----------------------------------------------------------------------------------------------------

public class Test {
     public static void main(String[] args) {
         short [] args = new short[]{50, 50};
         args[0] = 5;
         args[1] = 10;
         System.out.println("[" + args[0] + ", " + args[1] + "]");
     }
}

-----------------------------------------------------------------------------------------------------

class SpecialString {
     String str;
     SpecialString(String str) {
         this.str = str;
     }
}
 
public class Test {
     public static void main(String[] args) {
         System.out.println(new String("Java"));
         System.out.println(new StringBuilder("Java"));
         System.out.println(new SpecialString("Java"));
     }
}

------------------------------------------------------------------------------------------------------

public class Test {
     public static void main(String[] args) {
         StringBuilder sb = new StringBuilder("Java");
         String s1 = sb.toString();
         String s2 = sb.toString();
 
         System.out.println(s1 == s2);
     }
}

------------------------------------------------------------------------------------------------------

public class Test {
     public static void main(String [] args) {
         List<Integer> list = new ArrayList<Integer>();
         list.add(new Integer(2));
         list.add(new Integer(1));
         list.add(new Integer(0));
 
         list.remove(list.indexOf(0));
 
         System.out.println(list);
     }
}

------------------------------------------------------------------------------------------------------

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
 
class Employee {
     private String name;
     private int age;
     private double salary;
 
     public Employee(String name, int age, double salary) {
         this.name = name;
         this.age = age;
         this.salary = salary;
     }
 
     public String getName() {
         return name;
     }
 
    public int getAge() {
         return age;
     }
 
    public double getSalary() {
         return salary;
     }
 
    public String toString() {
         return name;
     }
}
 
public class Test {
     public static void main(String [] args) {
         List<Employee> list = new ArrayList<>();
         list.add(new Employee("James", 25, 15000));
         list.add(new Employee("Lucy", 23, 12000));
         list.add(new Employee("Bill", 27, 10000));
         list.add(new Employee("Jack", 19, 5000));
         list.add(new Employee("Liya", 20, 8000));
 
         process(list, /*INSERT*/);
 
         System.out.println(list);
     }
 
     private static void process(List<Employee> list, Predicate<Employee> predicate) {
         Iterator<Employee> iterator = list.iterator();
         while(iterator.hasNext()) {
             if(predicate.test(iterator.next()))
             iterator.remove();
         }
      }
}

----------------------------------------------------------------------------------------------------

public class Test {
     public static void main(String[] args) {
         int x = 1;
         while(checkAndIncrement(x)) {
             System.out.println(x);
         }
     }
 
     private static boolean checkAndIncrement(int x) {
         if(x < 5) {
             x++;
             return true;
         } else {
             return false;
         }
     }
}

---------------------------------------------------------------------------------------------------

class Student {
     String name;
     int marks;
 
     Student(String name, int marks) {
         this.name = name;
         this.marks = marks;
     }
}
 
public class Test {
     public static void main(String[] args) {
         Student student = new Student("James", 25);
         int marks = 25;
         review(student, marks);
         System.out.println(marks + "-" + student.marks);
     }
 
     private static void review(Student stud, int marks) {
         marks = marks + 10;
         stud.marks+=marks;
     }
}

----------------------------------------------------------------------------------------------------

public class Test {
     static {
         System.out.println(1/0);
     }
 
     public static void main(String[] args) {
         System.out.println("HELLO");
     }
}

---------------------------------------------------------------------------------------------------

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 
public class Test {
     public static void main(String[] args) {
         List<String> dryFruits = new ArrayList<>();
         dryFruits.add("Walnut");
         dryFruits.add("Apricot");
         dryFruits.add("Almond");
         dryFruits.add("Date");
 
         Iterator<String> iterator = dryFruits.iterator();
         while(iterator.hasNext()) {
             String dryFruit = iterator.next();
             if(dryFruit.startsWith("A")) {
                 dryFruits.remove(dryFruit);
             }
         }
        
         System.out.println(dryFruits);
    }
}

------------------------------------------------------------------------------------------------------

import java.util.function.Predicate;
 
public class Test {
     public static void main(String[] args) {
         String [] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};
 
         Predicate<String> p = s -> s.toUpperCase().substring(0,1).equals("A");
 
         processStringArray(arr, p);
     }
 
     private static void processStringArray(String [] arr, 
                                                Predicate<String> predicate) {
         for(String str : arr) {
             if(predicate.test(str)) {
                 System.out.println(str);
             }
         }
     }
}

------------------------------------------------------------------------------------------------------

import java.time.LocalDate;
 
class MyLocalDate extends LocalDate {
     @Override
     public String toString() {
         return super.getDayOfMonth() + "-" + super.getMonthValue() + 
            "-" +  super.getYear();
     }
}
 
public class Test {
     public static void main(String [] args) {
         MyLocalDate date = LocalDate.parse("1980-03-16");
         System.out.println(date);
     }
}

---------------------------------------------------------------------------------------------------

class Student {
     String name;
     int age;
 
     void Student() {
         Student("James", 25);
     }
 
     void Student(String name, int age) {
         this.name = name;
         this.age = age;
     }
}
 
public class Test {
     public static void main(String[] args) {
         Student s = new Student();
         System.out.println(s.name + ":" + s.age);
     }
}

--------------------------------------------------------------------------------------------------

public class Test {
     public static void main(String[] args) {
         do {
             System.out.println(100);
         } while (false);
         System.out.println("Bye");
     }
}

--------------------------------------------------------------------------------------------------

public class Test {
     public static void main(String[] args) {
         Double [] arr = new Double[2];
         System.out.println(arr[0] + arr[1]);
     }
}

--------------------------------------------------------------------------------------------------

public class Test {
     char c;
     double d;
     float f;
     public static void main(String[] args) {
         Test obj = new Test();
         System.out.println(">" + obj.c);
         System.out.println(">" + obj.d);
         System.out.println(">" + obj.f);
     }
}

-------------------------------------------------------------------------------------------------

public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(null).length());
    }
}

-------------------------------------------------------------------------------------------------

public class Test {
     public static void main(String[] args) {
         String fruit = "mango";
         switch (fruit) {
             default:
                 System.out.println("ANY FRUIT WILL DO");
             case "Apple":
                 System.out.println("APPLE");
             case "Mango":
                 System.out.println("MANGO");
             case "Banana":
                 System.out.println("BANANA");
                 break;
         }
     }
}

-------------------------------------------------------------------------------------------------

import java.util.ArrayList;
 
class Counter {
     int count;
     Counter(int count) {
         this.count = count;
     }
 
     public String toString() {
         return "Counter-" + count;
     }
}
 
public class Test {
     public static void main(String[] args) {
         ArrayList<Counter> original = new ArrayList<>();
         original.add(new Counter(10));
 
         ArrayList<Counter> cloned = (ArrayList<Counter>) original.clone();
         cloned.get(0).count = 5;
 
         System.out.println(original);
     }
}

--------------------------------------------------------------------------------------------------

import java.time.LocalDate;
import java.time.LocalTime;
 
public class Test {
     public static void main(String [] args) {
         LocalDate date = LocalDate.parse("1947-08-14");
         LocalTime time = LocalTime.MAX;
         System.out.println(date.atTime(time));
     }
}

-------------------------------------------------------------------------------------------------

-----------------------IMPORTANTE--------------------------------------------

Observe que as strings calculadas pela concatenação em tempo de compilação são referidas pelo pool de strings. Tempo de compilação A concatenação de strings ocorre quando ambos os operandos são constantes de tempo de compilação, como literal, variável final, etc. Isso significa que o resultado da expressão constante é calculado em tempo de compilação e posteriormente referenciado por String Pool. Para a questão dada, s1 refere-se a "OCAJP" (objeto String Pool). "OCAJP" + "" = "OCAJP". Como "OCAJP" já está disponível no conjunto de strings, o mesmo objeto é usado. Na execução, s1 e s2 referem-se ao mesmo objeto String e é por isso que s1 == s2 retorna verdadeiro. Observe que as strings calculadas pela concatenação no tempo de execução (se a expressão resultante não for uma expressão constante) são recém-criadas e, portanto, distintas. Para o trecho de código abaixo: String s1 = "OCAJP"; String s2 = s1 + ""; System.out.println (s1 == s2); A saída é falsa, pois s1 é uma variável e `s1 +" "` não é uma expressão constante, portanto, um novo objeto String não-pool é criado.

---------------------------------------------------------------------------------------------------

A classe A é declarada como pública e definida no pacote com.udayan.oca, não há problema em acessar a classe A fora do pacote com.udayan.oca. a classe B é definida no pacote com.udayan.oca.test, para estender da classe A, use a instrução de importação "import com.udayan.oca.A;" ou nome totalmente qualificado da classe com.udayan.oca.A. Nenhum problema com essa definição de classe também.Variable i1 é declarado public na classe A, portanto, linha 8 não causa qualquer erro de compilação. A variável i2 é declarada protegida, portanto, só pode ser acessada na subclasse usando herança, mas não usando a variável de referência do objeto. obj.i2 causa falha de compilação. A classe B herda a variável i2 da classe A, portanto dentro da classe B ela pode ser acessada usando this ou super. A linha 10 e a linha 11 não causam nenhum erro de compilação.

----------------------------------------------------------------------------------------------------

Esta questão está no operador ternário (? :). Se uma expressão tem múltiplos operadores ternários, então o número de? e: deve corresponder A expressão dada contém 2? e 1: e, portanto, erro de compilação.

----------------------------------------------------------------------------------------------------

Os itens 1 e 3 da ArrayList referem-se à mesma instância de String referida por s [s -> "Hello"] e o segundo item refere-se a outra instância de String.String é imutável, o que significa s.replace ("l", "L "); cria outra ocorrência de String "HeLLo", mas ainda se refere a "Hello" [s -> "Hello"]. [Hello, Hello, Hello] é impresso na saída.

-----------------------------------------------------------------------------------------------------


A primeira dimensão do array deve ser especificada no momento da declaração. novo int [] [8]; dá erro de compilação quando a primeira dimensão não é especificada.

-----------------------------------------------------------------------------------------------------

pausa; E continue; são usados ​​dentro de loop, portanto, nenhum erro de compilação. Na primeira iteração, "apple" é impresso no console. O cursor permanece na mesma linha que o método de impressão é usado e não imprime. Expressão booleana de if-block retorna false, o controle vai logo após if-block e acrescenta "salad!" para o console. pausa; A instrução pega o controle de loop, o método main termina e o programa termina com sucesso. Então, no console, você recebe "salada de maçã!"

-----------------------------------------------------------------------------------------------------

Você deve imprimir o elemento no índice 0, 2 e 4, o que significa que o índice deve começar com 0 e a expressão de etapa deve incrementar o índice em 2. Portanto, int n = 0; n <arr.length; n + = 2 é a resposta correta.

------------------------------------------------------------------------------------------------------

Dentro aprimorado para loop, System.out.println (arr [i]); é usado em vez de System.out.println (i); Quando o loop é executado pela primeira vez, armazena o primeiro elemento da matriz, que é 2, mas a declaração System.out.println imprime arr [2], que é 0. O loop é executado dessa maneira e imprime 0 1 2 no console.

-------------------------------------------------------------------------------------------------------






