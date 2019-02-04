package br.com.alura;

public class TestaAlunos {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções", "Gabriela Guedes");

        javaColecoes.adiona(new Aula("Dominando map e filter", 30));
        javaColecoes.adiona(new Aula("A Foco na certificação", 20));
        javaColecoes.adiona(new Aula("B Java/JavaScript", 40));

        Aluno aluno1 = new Aluno("Gabriela Guedes", 1298085);
        javaColecoes.matricula(aluno1);

        javaColecoes.getAlunos().forEach(a -> System.out.println(a));

    }

}
