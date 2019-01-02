import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        FileOutputStream file = new FileOutputStream("lorem.txt");
        Writer writer = new OutputStreamWriter(file);
        BufferedWriter buffered = new BufferedWriter(writer);

        buffered.write("heeeeeeeeeeeeeeeeeeeeeeeeeeinnnnnnnnnnnnnn");
        buffered.newLine();

        buffered.close();

    }

}
