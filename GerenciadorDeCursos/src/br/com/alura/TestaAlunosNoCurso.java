package br.com.alura;

public class TestaAlunosNoCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções", "Gabriela Guedes");

        javaColecoes.adiona(new Aula("Dominando map e filter", 30));
        javaColecoes.adiona(new Aula("A Foco na certificação", 20));
        javaColecoes.adiona(new Aula("B Java/JavaScript", 40));

        Aluno aluno1 = new Aluno("Gabriela Guedes", 1298085);
        Aluno aluno2 = new Aluno("Zeinho", 3454353);

        javaColecoes.matricula(aluno1);
        javaColecoes.matricula(aluno2);

        Aluno aluno = javaColecoes.buscaMatriculado(345435);
    }
}
