import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

    public static void main(String[] args) {

        String s = "C";
        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = s.getBytes();
        System.out.println(bytes.length + " UTF-8 ");

        Charset utf8 = StandardCharsets.UTF_8;
        String s1 = "13º Órgão Oficial";
        byte[] bytess = s1.getBytes(utf8);
        String s2 = new String(bytess, utf8);
        System.out.println(s2);

    }

}
