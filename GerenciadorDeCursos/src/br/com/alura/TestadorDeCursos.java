package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestadorDeCursos {

    public static void main(String[] args) {

       Curso javaColecoes = new Curso("Dominando as coleções", "Gabriela Guedes");

       javaColecoes.adiona(new Aula("Dominando map e filter", 30));
       javaColecoes.adiona(new Aula("A Foco na certificação", 20));
       javaColecoes.adiona(new Aula("B Java/JavaScript", 40));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println("A duração de todos os cursos é: " + javaColecoes.getTempoTotal());

    }

}
