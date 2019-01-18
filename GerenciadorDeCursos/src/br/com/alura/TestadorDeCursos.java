package br.com.alura;

import java.util.List;

public class TestadorDeCursos {

    public static void main(String[] args) {
        Curso colecoesDeCursos = new Curso("Java", "Gabriela Guedes");
        List<Aula> aulas = colecoesDeCursos.getAulas();
        colecoesDeCursos.adiona((new Aula("de frente com gaby", 46)));
        System.out.println(aulas);

    }

}
