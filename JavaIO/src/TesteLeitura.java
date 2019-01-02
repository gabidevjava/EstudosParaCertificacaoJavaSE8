import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(file);
        BufferedReader bufferedReader = new BufferedReader(isr);

        String linha = bufferedReader.readLine();

        while(linha != null) {
            System.out.println(linha);
            linha = bufferedReader.readLine();
        }

        bufferedReader.close();

    }

}
