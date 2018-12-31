package modelo;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappers {

    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(22); // autoboxing
        System.out.println(idadeRef.intValue()); // unboixing

        Double doubleRef = Double.valueOf(48); // autoboxing
        System.out.println(doubleRef.doubleValue()); // unboixing

        Boolean bRef = Boolean.FALSE; // autoboxing
        System.out.println(bRef.booleanValue()); // unboixing

        List<Number> numeros = new ArrayList<>();
        numeros.add(22);
        numeros.add(22.90);
        numeros.add(22.56f);


    }

}
