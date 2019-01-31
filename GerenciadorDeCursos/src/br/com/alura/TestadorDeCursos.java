package br.com.alura;

public class TestadorDeCursos {

    public static void main(String[] args) {

       Curso javaColecoes = new Curso("Dominando as coleções", "Gabriela Guedes");

       javaColecoes.adiona(new Aula("Dominando map e filter", 30));
       javaColecoes.adiona(new Aula("Foco na certificação", 20));
       javaColecoes.adiona(new Aula("Java/JavaScript", 40));

       System.out.println(javaColecoes.getAulas());

    }

}
