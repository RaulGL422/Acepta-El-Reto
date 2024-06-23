import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class D252 {
    public static void main(String[] args) throws IOException, NullPointerException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        String palabra, mitad, mitadInversa;
        int longitud;
        while ((palabra = br.readLine()).hashCode() != "XXX".hashCode()) {
            palabra = palabra.replace(" ", "").toLowerCase();
            longitud = palabra.length();
            mitad = palabra.substring(0, (longitud / 2)); 
            mitadInversa = new StringBuilder(palabra.substring(longitud / 2 + (longitud % 2 == 1 ? 1 : 0), longitud)).reverse().toString();
            result.append(mitadInversa.hashCode() == mitad.hashCode() ? "SI\n" : "NO\n");
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
}
