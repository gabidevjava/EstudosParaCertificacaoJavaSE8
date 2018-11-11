package a.b.c;

import java.util.*;

class Test5 {

	public static void main(String[] args) {	
		ArrayList<String> arr = new ArrayList<String>();
		
		for (String arg : args) {
			if(new Test6().arrE(arg)) { 
			arr.add(arg);
				
			}
		}
	}
}