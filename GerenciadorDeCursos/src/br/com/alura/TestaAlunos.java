package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestaAlunos {

    public static void main(String[] args) {

        Collection<String> alunos = new HashSet<>();
        alunos.add("Gabriela Guedes");
        alunos.add("Guedes Rayssa");

        for (String aluno: alunos) {
            System.out.println(aluno);
        }

        System.out.println(alunos);

    }

}
