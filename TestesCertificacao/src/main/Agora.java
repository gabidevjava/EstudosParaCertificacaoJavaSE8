package main;

import java.util.ArrayList;
import java.util.List;

public class Agora {
	
	public static void main(String[] args) {
		 List<Boolean> list = new ArrayList<>();
         list.add(true);
         list.add(new Boolean("tRue"));
         list.add(new Boolean("abc"));
 
         if(list.remove(1)) {
             list.remove(1);
         }
 
         System.out.println(list);
		
	}

}
