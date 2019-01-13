import java.nio.charset.Charset;

public class TesteUnicodeEEncoding {

    public static void main(String[] args) {

        String s = "C";
        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = s.getBytes();
        System.out.println(bytes.length + " UTF-8 ");

    }

}
