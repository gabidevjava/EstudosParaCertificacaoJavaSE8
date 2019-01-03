import java.io.*;

public class TesteEscrita2 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem.txt"));
        bw.write("e zaga e teileeeeeeeeeeee");
        bw.newLine();
        bw.write("e zaga e java is life");
        bw.write("javascript is life");
        bw.close();
    }

}
