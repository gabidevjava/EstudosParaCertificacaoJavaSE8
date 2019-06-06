package main;

import java.util.ArrayList;
import java.util.List;

public class MaisTeste {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("SpaceStation");
		System.out.println("inicialmente ==>>>> " + sb);
        String upperCase = sb.delete(5, 6).insert(5, " S").toString().toUpperCase();
        System.out.println("depois       ==>>>> " + sb);
        System.out.println(upperCase);
        
        System.out.println("Hello");;;;;;;;;

	}

}
