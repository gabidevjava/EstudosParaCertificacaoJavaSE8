import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("Jogo csgo");
        palavras.add("Também assisto muitos animes");
        palavras.add("Estudo muito java");

        Collections.sort(palavras);

        //palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        palavras.sort(Comparator.comparing(s -> s.length()));
        palavras.sort(Comparator.comparing(String::length));

        palavras.forEach(System.out::println);

    }

}


