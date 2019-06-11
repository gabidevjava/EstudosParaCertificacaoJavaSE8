package main;

import java.io.FileNotFoundException;

public class Testttes {

	public static void main(String[] args) {
		Boolean b = new Boolean("tRUe");
        switch(b) {
            case true:
                System.out.println("ONE");
            case false:
                System.out.println("TWO");
            default: 
                System.out.println("THREE");
        }

	}

}
