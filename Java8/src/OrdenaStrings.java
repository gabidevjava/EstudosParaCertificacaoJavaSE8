import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaStrings {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("Jogo csgo");
        palavras.add("Também assisto muitos animes");
        palavras.add("Estudo muito java");

        Collections.sort(palavras);
        System.out.println(palavras);

    }

}

class comparadorPorTamanho implements Comparable<String> {

    @Override
    public int compareTo(String s) {
        return 0;
    }

}
