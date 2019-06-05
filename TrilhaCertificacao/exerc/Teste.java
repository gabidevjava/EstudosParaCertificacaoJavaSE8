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

O método m está sobrecarregado. Qual método sobrecarregado para chamar é decidido em tempo de compilação. m (i) é marcado como m (int) como i é do tipo int e m ('5') é marcado como m (char) como '5' é literal de caractere.

-------------------------------------------------------------------------------------------------------

list.add (0, 'V'); => char 'V' é convertido em objeto Character e armazenado como o primeiro elemento na lista. lista -> [V]. list.add ('T'); => char 'T' é auto-boxed para o objeto Character e armazenado no final da lista. lista -> [V, T]. list.add (1, 'E'); => char 'E' é auto-empacotado para o objeto Character e inserido no índice 1 da lista, isso muda T para a direita. lista -> [V, E, T]. list.add (3, 'O'); => char 'O' é auto-boxed para o objeto Character e adicionado no índice 3 da lista. list -> [V, E, T, O]. list.contains ('O') => o 'O' é auto-empacotado para o objeto Caractere e, como a classe Caractere substitui o método equals (String), esta expressão retorna verdadeiro. O controle vai dentro de if-block e executa: list.remove ('O') ;. O método remove está sobrecarregado: remove (int) e remove (Object). char pode ser facilmente atribuído a int para que as tags do compilador removam o método (int). list.remove (valor <ASCCI de 'O'>); ASCCI valor de 'A' é 65 (isso todo mundo sabe) assim valor ASCII de 'O' será mais de 65. list.remove ('O') lança exceção de tempo de execução, como ele tenta remover um item do índice maior que 65 mas o índice permitido é de 0 a 3 apenas.

----------------------------------------------------------------------------------------------------------

O método main (args) é invocado recursivamente sem especificar nenhuma condição de saída, portanto, este código finalmente lança java.lang.StackOverflowError. StackOverflowError é uma subclasse do tipo Erro e não do tipo Exceção, portanto, não é tratado. O rastreamento de pilha é impresso no console e o programa termina abruptamente. O Java não permite capturar exceções específicas verificadas se elas não forem lançadas pelas instruções dentro do bloco try. catch (java.io.FileNotFoundException ex) {} irá causar erro de compilação neste caso como main (args); nunca jogará FileNotFoundException. Mas Java permite capturar o tipo de exceção, portanto, catch (exceção ex) {} não causa nenhum erro de compilação.

------------------------------------------------------------------------------------------------------------

date -> {2012-01-11}, período -> {P2M}, date.minus (período) -> {2011-11-11} [subtrair período de dois meses a partir de {2012-01-11}, mês é alterado para 11 e o ano é alterado para 2011]. formatter -> {MM-dd-yy}, quando date {2011-11-11} é formatador neste formato 11-11-11 é impresso no console.

------------------------------------------------------------------------------------------------------------

As classes A e B são declaradas públicas e dentro do mesmo pacote com.udayan.oca. O método print () da classe A foi corretamente substituído pelo método B. print () é público, portanto, não há problemas em acessá-lo em qualquer lugar. Vamos verificar o código dentro do método principal. Um obj1 = new A (); => obj1 refere-se a uma instância da classe A. B obj2 = (B) obj1; => obj1 é do tipo A e é atribuído a obj2 (tipo B), portanto, a conversão explícita é necessária. obj1 refere-se a uma instância da classe A, portanto, em tempo de execução, obj2 também se referirá a uma instância da classe A. O sub-tipo não pode referir-se a um objeto do tipo super em tempo de execução B obj2 = (B) obj1; lançará ClassCastException.

-------------------------------------------------------------------------------------------------------------

É um esquema pass-by-reference.Inicialmente, msg = "Feliz Ano Novo!" A chamada à mudança de método (Message) não modifica a propriedade msg do objeto passado, mas cria outro objeto Message e modifica a propriedade msg do novo objeto para "Boas Festas!" Assim, a instância da Mensagem referida por obj permanece inalterada.Hence na saída, você obtém: Feliz Ano Novo! Feliz Ano Novo!

-------------------------------------------------------------------------------------------------------------

ClassCastException estende RuntimeException (exceção não verificada), FileNotFoundException estende IOException, IOException estende Exception (exceção verificada), ExceptionInInitializerError é da família Error e é lançado por um bloco inicializador estático, RuntimeException e todas as suas subclasses são exceções não verificadas.

-------------------------------------------------------------------------------------------------------------

minusYears, minusMonths, minusWeeks, minusDays métodos aceitam parâmetro longo para que você possa passar valor positivo ou negativo. Se o valor positivo for passado, esse valor especificado é subtraído e, se o valor negativo for passado, o valor especificado será adicionado. Eu acho que você ainda se lembra: menos menos é mais. Da mesma forma, mais métodos Years, plusMonths, plusWeeks, plusDays funcionam da mesma maneira. Se o valor positivo for passado, o valor especificado será adicionado e, se o valor negativo for passado, o valor especificado será subtraído.

lista1 -> [A, D], lista2 -> [B, C], list1.addAll (1, lista2); é quase igual a list1.add (1, [B, C]); => Insere B no índice 1, C pega no índice 2 e D é movido para o índice 3. list1 -> [A, B, C, D]

--------------------------------------------------------------------------------------------------------------

A classe abstrata pode ter construtores e também é possível ter uma classe abstrata sem nenhum método abstrato. Portanto, não há problema com a classe Animal. Compilador Java adiciona super (); como a primeira instrução dentro do construtor, se a chamada para outro construtor usando este (...) ou super (...) não estiver disponível. Dentro da classe Animal Constructor, o compilador adiciona super (); => Animal (nome da string) {super (); this.name = nome; }, super () neste caso invoca o construtor no-arg da classe Object e, portanto, nenhum erro de compilação aqui. O compilador altera o construtor Dog (String) para: Dog (String breed) {super (); this.breed = raça; }. O construtor No-arg não está disponível na classe Animal e, como outro construtor é fornecido, o compilador java não adiciona um construtor padrão. Portanto, o construtor Dog (String) fornece um erro de compilação. Não há problema com o construtor Dog (String, String).

----------------------------------------------------------------------------------------------------------------

Primeiro você deve descobrir o motivo do erro de compilação. Os métodos declarados na interface Printable são implicitamente abstratos, sem problemas com a interface Printable. class Paper é declarado abstract e implementa Printable interface, ele sobrescreve o método setMargin () mas o método setOrientation () ainda é abstrato. Não há problemas com a classe de papel, pois é uma classe abstrata e pode ter 0 ou mais métodos abstratos. A classe NewsPaper é uma classe concreta e estende a classe Paper (que é abstrata). Portanto, a classe Papel deve substituir o método setOrientation () OU deve ser declarado como abstrato. Substituindo a linha 9 por 'public abstract void setOrientation ();' não é necessário e não resolverá o erro de compilação na classe NewsPaper. Substituir a Linha 7 por 'classe Implementos de papel imprimíveis {' causará falha na compilação da classe Paper, pois herda o método abstrato 'setOrientation'.

-----------------------------------------------------------------------------------------------------------------

O método equals declarado na classe Object tem a declaração: public boolean equals (Object). Geralmente, o método equals é usado para comparar instâncias diferentes da mesma classe, mas se você passar qualquer outro objeto, não haverá erro de compilação. O tipo de parâmetro é Object para aceitar qualquer objeto Java. str.equals (sb) => A classe String substitui o método equals (Object), mas como "sb" é do tipo StringBuilder, então isso retorna false. A classe StringBuilder não substitui o método equals (Object). Então, a versão do objeto é invocada, que usa o operador ==, portanto, sb.equals (str) retorna falso também. false: false é impresso no console.

------------------------------------------------------------------------------------------------------------------

A variável int pode ser facilmente atribuída ao tipo double, mas double [] e int [] não são compatíveis. Na verdade, ambos são irmãos e não podem ser atribuídos um ao outro, portanto, a Linha 3 causa falha na compilação.

-------------------------------------------------------------------------------------------------------------------

Compilador Java adiciona super (); como a primeira instrução dentro do construtor, se a chamada para outro construtor usando este (...) ou super (...) não estiver disponível. Compilador adiciona super (); como a primeira linha no construtor do OTG: OTG (int capacity, String type) {super (); } mas a classe PenDrive não possui um construtor no-arg e é por isso que o construtor do OTG fornece um erro de compilação. Para corrigir o erro de compilação, o construtor da classe pai deve ser chamado usando super (capacidade); Isso resolveria o erro de compilação. super (capacidade); só irá atribuir valor à propriedade da capacidade, para atribuir valor ao tipo outra declaração é necessária. this.type = type; deve ser a segunda declaração. Lembre-se: A chamada de construtor usando este (...) ou super (...) deve ser a primeira instrução dentro do construtor.

--------------------------------------------------------------------------------------------------------------------

Antes de responder isso, você deve saber que existem 5 objetos Student diferentes criados na memória (4 no momento da adição à lista e 1 no momento da remoção da lista). Isso significa que esses 5 objetos Student serão armazenados em endereços de memória diferentes. O método remove (Object) remove a primeira ocorrência do objeto correspondente e o método equals (Object) decide se 2 objetos são iguais ou não. O método equals (Object) definido na classe Object usa o operador == para verificar a igualdade e, nesse caso, os 5 objetos Student são armazenados em uma localização de memória diferente, portanto, não iguais. Nada é removido da lista de alunos, todos os 4 objetos Student são impressos no pedido de veiculação.

---------------------------------------------------------------------------------------------------------------------

System.out.println (str1 = str2) tem operador de atribuição (=) e não operador de igualdade (==). Após a atribuição, str1 refere-se a "CoRe" e System.out.println imprime "CoRe" no console.

---------------------------------------------------------------------------------------------------------------------

LocalDateTime armazena as partes de data e hora. LocalDateTime.now (); recupera a data e hora atuais do relógio do sistema. obj.getSecond () pode retornar qualquer valor entre 0 e 59.

--------------------------------------------------------------------------------------------------------------------

Objetos LocalDate podem ser criados usando análise de método estático e de. O método removeIf (Predicate) foi incluído como um método padrão na interface Collection no JDK 8 e remove todos os elementos dessa coleção que satisfazem o predicado fornecido. O método de teste do predicado retorna true para todos os objetos LocalDate com ano menor que 2000. Portanto, todos os objetos LocalDate com valor de ano menor que 2000 são removidos da lista. Os objetos LocalDate restantes são impressos em seu pedido de veiculação.

--------------------------------------------------------------------------------------------------------------------

O método LocalDate.of (...) primeiro valida o ano, depois o mês e finalmente o dia do mês. Setembro não pode ter 31 dias, então o método LocalDate.of (...) lança uma instância da classe java.time.DateTimeException.

---------------------------------------------------------------------------------------------------------------------

DICA: Primeiro verifique se os membros estão acessíveis ou não. Todos os códigos estão no mesmo arquivo Test.java, e Point class e variable x, y são declarados com o modificador default, portanto, estes podem ser acessados ​​dentro do mesmo pacote. O Teste de Classe pertence ao mesmo pacote, portanto, não há problemas em acessar a classe Point e as variáveis ​​de instância da classe Point.
Faça uso de caneta e papel para desenhar os diagramas de memória (pilha e pilha). Será muito rápido para alcançar o resultado. Ponto p1 = new Point (); significa p1.x = 0 e p1.y = 0 como variável de instância são inicializados para os respectivos zeros. p1.x = 10; significa substituir 0 por 10 em p1.x, p1.y = 20; significa substituir 0 por 20 em p1.y, ponto p2 = novo ponto (); significa p2.x = 0 e p2.y = 0 como variável de instância são inicializados para os respectivos zeros. p2.assign (p1.x, p1.y); invoca o método assign, variável de parâmetro x = 10 e y = 20. Como assign é invocado na variável de referência p2, portanto, this e p2 referem-se ao mesmo objeto Point. x = this.x; significa atribuir 0 à variável de parâmetro x, sem alterações neste.y, o que significa que p2.x não é alterado. this.y = y; significa atribuir 20 a this.y, o que significa que p2.y agora é 20So, depois que o método assign é invocado e o controle retorna ao método main: p1.x = 10, p1.y = 20, p2.x = 0 e p2.y = 20. A saída é: Point (10, 20); Point (0, 20)

-------------------------------------------------------------------------------------------------------------------

Period.of (0, 0, 0); é equivalente a Period.ZERO. O período ZERO é exibido como P0D, exceto que os componentes do período (ano, mês, dia) com valores 0 são ignorados. O resultado de toString () começa com P, e para um ano diferente de zero, Y é anexado; para um mês diferente de zero, M é anexado; e para dia diferente de zero, D é anexado. P, Y, M e D estão em maiúsculas. NOTA: O método Period.parse (CharSequence) aceita o parâmetro String no formato "PnYnMnD", aqui P, Y, M e D podem estar em qualquer caso.

-------------------------------------------------------------------------------------------------------------------

isAfter e isBefore o método pode ser interpretado como: 1 de janeiro de 2018 vem depois de 25 de dezembro de 2018? Não, falso. 1º de janeiro de 2018 vem antes de 25 de dezembro de 2018? Sim, verdade.

-------------------------------------------------------------------------------------------------------------------

switch pode aceitar tipos primitivos: byte, short, int, char; tipos de wrapper: Byte, Short, Integer, Character; String e enums. Nesse caso, todos são valores válidos, mas apenas 3 executam "case 7:". case é comparar o valor inteiro 7. NOTA: caractere sete, '7' é diferente do valor inteiro sete, 7. Então "char var = '7';" e "Character var = '7';" imprimirá DEFAULT no console.

--------------------------------------------------------------------------------------------------------------------

`new StringBuilder (100);` cria uma instância StringBuilder, cujo comprimento da matriz char interna é 100, mas o método length () do objeto StringBuilder retorna o número de caracteres armazenados na matriz interna e neste caso é 0. Então, `sb .length () `retorna 0. sb.toString () é a representação String da ocorrência de StringBuilder e neste caso, como não há caracteres dentro do objeto StringBuilder, portanto sb.toString () retorna uma String vazia" ", então` sb .toString (). length () `também retorna 0. A saída é 0: 0.

---------------------------------------------------------------------------------------------------------------------

Primeiro, adicione parênteses (parênteses redondos) à expressão dada: -a ++. Existem 2 operadores envolvidos. unário menos e operador Postfix. Vamos começar com expressão e valor de a.-a ++; [a = 100] - (a ++); [a = 100] O operador do postfix tem precedência mais alta que o operador unário. - (100); [a = 101] Use o valor de a (100) na expressão e depois disso aumente o valor de a para 101. -100; [a = 101] -100 é impresso no console.

----------------------------------------------------------------------------------------------------------------------

As classes String e StringBuilder substituem o método toString (), que imprime o texto armazenado nessas classes. A classe SpecialString não substitui o método toString () e, portanto, quando a instância de SpecialString é impressa no console, você obtém: <nome totalmente qualificado da classe SpecialString> @ <representação hexadecimal do código hash>.

-----------------------------------------------------------------------------------------------------------------------

O método remove da interface List está sobrecarregado: remove (int) e remove (Object). O método indexOf aceita o argumento do tipo Object, neste caso list.indexOf (0) => 0 é auto-boxed para o objeto Integer, portanto nenhum problema com o código indexOf. list.indexOf (0) retorna 2 (índice no qual 0 é armazenado na lista). Então list.remove (list.indexOf (0)); é convertido em list.remove (2); remove (int) a versão é correspondida, é uma correspondência direta para que o compilador não faça o auto-boxing neste caso. list.remove (2) remove o elemento no índice 2, que é 0. Assim, na saída, você obtém [2, 1].

------------------------------------------------------------------------------------------------------------------------

Este é um exemplo de esquema de passagem por valor. x do método checkAndIncrement contém a cópia da variável x definida no método main. Portanto, as alterações feitas em x no método checkAndIncrement não são refletidas na variável x de main. x de main permanece como 1 dentro do código principal não está alterando seu valor. Toda vez que o método checkAndIncrement é invocado com o valor do argumento 1, então true é retornado sempre e, portanto, enquanto o loop é executado indefinidamente.

-------------------------------------------------------------------------------------------------------------------

Esta questão verifica seu conhecimento de esquemas de passagem por valor e de passagem por referência. Nas declarações abaixo: estudante <main> significa aluno dentro do método principal. Na execução do método main: student <main> -> {"James", 25}, marca <main> = 25. Na execução do método de revisão: stud <review> -> {"James", 25} (mesmo objeto referido pelo aluno <main>), marca <review> = 25 (esta marca é diferente das marcas definidas no método main). marca <review> = 35 e stud.marks = 60. Então, no final do método de revisão: stud <review> -> {"James", 60}, marca <review> = 35. O controle retorna ao método main: student <main> -> {"James", 60}, marcas <main> = 25. As alterações feitas na variável de referência são visíveis no método principal, mas as alterações feitas na variável primitiva não são refletidas no método main.

---------------------------------------------------------------------------------------------------------------------

A exceção ConcurrentModificationException pode ser emitida para a seguinte condição: 1. A coleta está sendo iterada usando o Iterator / ListIterator ou usando o loop for-each. E 2. Execução dos métodos Iterator.next (), Iterator.remove (), ListIterator.previous (), ListIterator.set (E) & ListIterator.add (E). Esses métodos podem lançar java.util.ConcurrentModificationException caso a Coleção tenha sido modificada por outros meios além do próprio iterador, como Collection.add (E) ou Collection.remove (Object) ou List.remove (int) etc. código, lista 'dryFruits' está sendo iterada usando o Iterator <>. O método hasNext () do Iterator tem a seguinte implementação: public boolean hasNext () {return cursor! = size; } Onde cursor é o índice do próximo elemento a retornar e inicialmente é 0. 1ª Iteração: cursor = 0, tamanho = 4, hasNext () retorna verdadeiro. iterator.next () incrementa o cursor em 1 e retorna "Walnut". 2ª Iteração: cursor = 1, tamanho = 4, hasNext () retorna verdadeiro. iterator.next () incrementa o cursor em 1 e retorna "Apricot". Como "Apricot" começa com "A", portanto, dryFruits.remove (dryFruit) remove "Apricot" da lista e, portanto, reduz o tamanho da lista em 1, o tamanho torna-se 3. 3rd Iteration: cursor = 2, size = 3, hasNext ( ) retorna verdadeiro. O método iterator.next () lança java.util.ConcurrentModificationException. Se você quiser remover os itens de ArrayList, enquanto estiver usando Iterator ou ListIterator, use o método Iterator.remove () ou ListIterator.remove () e o método NOT List.remove (...). Usar o método List.remove (...) ao iterar a lista (usando o Iterator / ListIterator ou for-each) pode lançar java.util.ConcurrentModificationException.

---------------------------------------------------------------------------------------------------------------------

substring (int beginIndex, int endIndex) é usado para extrair a substring. A subseqüência começa em "beginIndex" e se estende até "endIndex - 1". As informações do código do país são armazenadas no índice 4 e 5, portanto, o método de substring correto para extrair o código do país é: swiftCode.substring (4, 6);

-------------------------------------------------------------------------------------------------------------------------

LocalDate é uma classe final, portanto, não pode ser estendida.

----------------------------------------------------------------------------------------------------------------------

O método 'append' está sobrecarregado na classe StringBuilder: append (String), append (StringBuffer) e append (char []) etc. Nesse caso, o compilador fica confuso sobre qual método `append (null)` pode ser marcado porque String, StringBuffer e char [] não estão relacionados entre si na herança multinível. Portanto, o `sb.append (null)` causa um erro de compilação.

-----------------------------------------------------------------------------------------------------------------------

Vamos supor: new ArrayList <> () é armazenado em [15EE00]. o novo contador (10) é armazenado em [25AF06]. original contém endereço de memória do objeto contador acima. [15EE00] -> {25AF06}. Agora original.clone () criará um novo objeto de lista de arrays, suponha em [45BA12] e então copiará o conteúdo do objeto ArrayList armazenado em [15EE00]. Então, clonado contém endereço de memória do mesmo objeto contador. [45BA12] -> {25AF06} Nesse caso, original! = Clonado, mas original.get (0) == cloned.get (0). Isso significa que ambas as listas de arrays são criadas em locais de memória diferentes, mas se referem ao mesmo objeto Counter. cloned.get (0) retorna o objeto contador armazenado em [25AF06] e .count = 5 significa que [25AF06] se refere a [Objeto Contador (5)]. System.out.println (original); Imprime o elemento de ArrayList original, que é: {25AF06} e o método toString () imprime: Counter-5 como o objeto Counter referido por [25AF06] é [Counter object (5)].

-----------------------------------------------------------------------------------------------------------------------

LocalTime.MIN -> {00:00}, LocalTime.MAX -> {23: 59: 59.999999999}, LocalTime.MIDNIGHT -> {00:00}, LocalTime.NOON -> {12:00}. O método date.atTime (LocalTime) cria uma instância LocalDateTime combinando partes de data e hora. O método toString () da classe LocalDateTime imprime as partes de data e hora separadas por T em maiúsculas.

-----------------------------------------------------------------------------------------------------------------------

passportNo 'deve ser somente leitura para qualquer outra classe. Isso significa tornar o' passportNo 'privado e fornecer o método getter público. Não forneça setter público, pois 'passportNo' será propriedade de leitura / gravação. Se o passportNo for declarado com o escopo padrão, outras classes no mesmo pacote poderão acessar o passportNo para a operação de leitura / gravação.

-----------------------------------------------------------------------------------------------------------------------

Lista não pode aceitar primitivos, pode aceitar apenas objetos. Portanto, quando 100 e 200 são adicionados à lista, o recurso de autoincrustação os converte em objetos de invólucro do tipo Integer. Então, 4 itens são adicionados à lista. Pode-se esperar o mesmo comportamento com o método remove, assim, 100 será auto-empacotado para o objeto Integer. Mas o método remove está sobrecarregado na interface List: remove (int) => Remove o elemento da posição especificada nesta lista e remove (Object) => Remove a primeira ocorrência do elemento especificado da lista. Como a versão remove (int) está disponível, o que combina perfeitamente com a remoção de chamada (100); portanto, o compilador não faz o auto-boxing neste caso. Mas no tempo de execução remove (100) tenta remover o elemento no índice 100 e isso lança IndexOutOfBoundsException.

------------------------------------------------------------------------------------------------------------------------




