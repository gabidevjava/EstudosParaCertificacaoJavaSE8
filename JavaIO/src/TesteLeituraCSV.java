import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraCSV {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("contas.csv"));

        while(scanner.hasNextLine()) {
            String linha = scanner.nextLine();

            Scanner comparar = new Scanner(linha);
            comparar.useLocale(Locale.US);
            comparar.useDelimiter(",");

            String tipoConta = comparar.next();
            int agencia = comparar.nextInt();
            int numero = comparar.nextInt();
            String titular = comparar.next();
            double saldo = comparar.nextDouble();

            String valorFormatado = String.format(
                    new Locale("pt", "BR"),"%s - %d-%d - %s - %05.2f",
                    tipoConta, agencia, numero, titular, saldo);

            System.out.println(valorFormatado);
            comparar.close();
        }
        scanner.close();
    }

}
