package main;

import java.util.ArrayList;
import java.util.List;

public class Agora {

	public static void main(String[] args) throws Exception {
		List<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        list.add("X");
        list.add("Y");
        list.add("Z");
        list.remove(new String("Y"));
        System.out.println(list);
	}

}
