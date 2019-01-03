import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscrita3 {

    public static void main(String[] args) throws IOException {

     /*   BufferedWriter bw = new BufferedWriter(new FileWriter("lorem.txt"));
        bw.write("e zaga e teileeeeeeeeeeee");
        bw.newLine();
        bw.write("e zaga e java is life");
        bw.write("javascript is life");
        bw.close();*/

        PrintStream ps = new PrintStream("lorem2.txt");
        ps.println("e zaga e teileeeeeeeeeeee kk e zaga");
        ps.println();
        ps.println("armaria");

        ps.close();
    }

}
