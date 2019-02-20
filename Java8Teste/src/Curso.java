import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Curso {

    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}

class ExemploCurso {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();

        cursos.add(new Curso("JavaScritp", 140));
        cursos.add(new Curso("Java", 500));
        cursos.add(new Curso("PHP", 1));

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .map(c -> c.getAlunos())
                .forEach(System.out::println);

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .findAny()
                .ifPresent(c -> System.out.println(c.getNome()));


    }
}