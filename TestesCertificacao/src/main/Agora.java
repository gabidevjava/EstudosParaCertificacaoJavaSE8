package main;

import java.util.ArrayList;
import java.util.List;

public class Agora {
	
	public static void main(String[] args) {
		
		int [] arr1 = {1, 2, 3};
        int [] arr2 = {'A', 'B'}; //ASCII code of 'A' is 65, 'B' is 66
        arr1 = arr2;
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    
		
		/*final int i1 = 1;
        final Integer i2 = 1;
        final String s1 = ":ONE";
        
        String str1 = i1 + s1;
        String str2 = i2 + s1;
        
        System.out.println(str1 == "1:ONE");
        System.out.println(str2 == "1:ONE");*/
		
		/*List<StringBuilder> dryFruits = new ArrayList<>();
        dryFruits.add(new StringBuilder("Walnut"));
        dryFruits.add(new StringBuilder("Apricot"));
        dryFruits.add(new StringBuilder("Almond"));
        dryFruits.add(new StringBuilder("Date"));

        for(int i = 0; i < dryFruits.size(); i++) 
        {
            if(i == 0) {
                dryFruits.remove(new StringBuilder("Almond"));
            }
         }

        System.out.println(dryFruits);
		
		List<Student> students = new ArrayList<>();
        students.add(new Student("James", 25));
        students.add(new Student("James", 27));
        students.add(new Student("James", 25));
        students.add(new Student("James", 25));

        students.remove(new Student("James", 25));

        for(Student stud : students) {
            System.out.println(stud);
        }*/
		
	
	}

}
