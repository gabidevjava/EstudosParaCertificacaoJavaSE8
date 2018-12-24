package util;

import modelo.Conta;
import modelo.ContaCorrente;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {

        // generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

        ContaCorrente cc = new ContaCorrente(11, 22);
        lista.add(cc);
        ContaCorrente cc1 = new ContaCorrente(11, 22);
        lista.add(cc1);
        System.out.println(lista.size());

        Conta ref =  lista.get(0);
        System.out.println(ref.getNumero());

        for (int i = 0; i < lista.size(); i++) {
            Object oREf = lista.get(i);
            System.out.println(oREf);
        }

        for (Object oRef : lista) {
            System.out.println(oRef);
        }
    }

}
