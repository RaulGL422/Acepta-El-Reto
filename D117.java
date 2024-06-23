import java.io.IOException;
import java.io.OutputStream;

public class D117 {

    private static String next() throws IOException, NullPointerException, NumberFormatException {
        StringBuilder palabra = new StringBuilder();
        int input;
        while((input = System.in.read()) != '\n') palabra.append((char) input);
        return palabra.toString();
    }
    
    public static void main(String[] args) throws IOException, NullPointerException, NumberFormatException {
        int casos = Integer.parseInt(next());
        StringBuilder result = new StringBuilder();
        while (casos-- != 0) {
            String nombre = next().substring(4);
            result.append("Hola, " + nombre + ".\n");
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
}