import java.io.IOException;
import java.io.OutputStream;

public class D467 {
    private static String obtPalabra() throws IOException, NullPointerException, NumberFormatException {
        int input;
        StringBuilder palabra = new StringBuilder();
        while((input = System.in.read()) != '\n' && input != ' ') palabra.append((char) input);
        return palabra.toString();
    }
    public static void main(String[] args) throws NumberFormatException, IOException, NullPointerException {
        int casos = Integer.parseInt(obtPalabra());
        StringBuilder result = new StringBuilder();
        while (casos-- != 0) {
            String palabra1 = obtPalabra();
            obtPalabra();
            String palabra2 = obtPalabra();
            result.append(palabra1.equalsIgnoreCase(palabra2) ? "TAUTOLOGIA\n" : "NO TAUTOLOGIA\n");
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
}
