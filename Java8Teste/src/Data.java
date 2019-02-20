import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Data {

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate meuAniversario = LocalDate.of(2019, Month.JUNE, 19);

        Period periodo = Period.between(hoje, meuAniversario);
        System.out.println(periodo.getMonths());

        LocalDate proximoAniversario = meuAniversario.plusYears(4);
        System.out.println(proximoAniversario);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        String valorFormatado = proximoAniversario.format(formatador);
        System.out.println(valorFormatado);

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorComHoras));

        ZonedDateTime teste = ZonedDateTime.now();
        System.out.println("teste " + teste);

    }
}
