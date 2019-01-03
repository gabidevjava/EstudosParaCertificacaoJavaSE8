import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader bufferedReader = new BufferedReader(isr);

       bufferedReader.close();

    }

}
