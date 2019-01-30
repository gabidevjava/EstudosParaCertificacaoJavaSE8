package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class TestadorDeCursos {

    public static void main(String[] args) {

        String aula1 = "Começando novamente o curso";
        String aula2 = "Agora vai";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);

        System.out.println(aulas);
        System.out.println("-------------------------------------------------");

        for (String aula : aulas) {
            System.out.println("Aula " + aula);
        }


   /*     Curso colecoesDeCursos = new Curso("Java", "Gabriela Guedes");
        List<Aula> aulas = colecoesDeCursos.getAulas();
        colecoesDeCursos.adiona((new Aula("de frente com gaby", 46)));
        System.out.println(aulas);*/

    }

}
