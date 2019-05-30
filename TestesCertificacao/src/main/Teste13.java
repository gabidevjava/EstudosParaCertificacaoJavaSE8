package main;


import java.util.ArrayList;
import java.util.List;

public class Teste13 {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(2));
        list.add(new Integer(1));
        list.add(new Integer(0));
        list.add(new Integer(10));
        list.add(new Integer(7));

        list.remove(list.indexOf(10));

        System.out.println(list);
    }
}