package main;

import java.util.ArrayList;
import java.util.List;

public class Testttes {

	public static void main(String[] args) {
		 int start = 1;
         int sum = 0;
         do {
             if(start % 2 == 0) {
                 continue;
             }
             sum += start;
         } while(++start <= 10);
         System.out.println(sum);

	}
	
/*	 int [] arr1 = {1, 2, 3};
     int [] arr2 = {'A', 'B'}; //ASCII code of 'A' is 65, 'B' is 66
     arr1 = arr2;
     for(int i = 0; i < arr1.length; i++) {
         System.out.print(arr1[i] + " ");
     }*/
}
