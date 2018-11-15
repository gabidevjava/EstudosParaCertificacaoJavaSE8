package teste;

import java.util.*;

class Test5 {

	public static void main(String[] args) {	
		ArrayList<String> arr = new ArrayList<String>();
		
		for (String arg : args) {
			if(new Test6().existe(arg)) { 
			arr.add(arg);
				
			}
		}
	}
}

import java.io.*;

class Test6 {
	
		public boolean existe(String name) {	
			File f = new File(name);
			return f.existe();
		
		}
}

// secao 1.2 cap1;