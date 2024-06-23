import java.io.IOException;
import java.io.OutputStream;

public class D446 {

    private static String next() throws IOException, NullPointerException, NumberFormatException {
        StringBuilder palabra = new StringBuilder();
        int input;
        while((input = System.in.read()) != '\n' && input != ' ') palabra.append((char) input);
        return palabra.toString();
    }

    public static void main(String[] args) throws IOException, NullPointerException, NumberFormatException {
        int casos = Integer.parseInt(next());
        StringBuilder result = new StringBuilder();
        while (casos-- != 0) {
            String nombreNieto = next();
            int nietos = Integer.parseInt(next()), acierto = 0;
            for (int i = 1; i <= nietos; i++) {
                String actual = next();
                if (actual.hashCode() == nombreNieto.hashCode() && acierto == 0) acierto = i;
            } 
            
            result.append(acierto == nietos && nietos != 1 ? "VERDADERA\n" : "FALSA\n"); 
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
}
