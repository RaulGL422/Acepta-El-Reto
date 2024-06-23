import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D372 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(entrada.readLine());
        while (casos-- != 0) {
            char[] palabra = entrada.readLine().toCharArray();
            char[] procesado = new char[palabra.length];
            for (int i = 0; i < palabra.length; i++) {
                char caracter = palabra[palabra.length - i - 1];
                procesado[i] = (Character.isUpperCase(palabra[i]) ? Character.toUpperCase(caracter) : Character.toLowerCase(caracter));
            }
            System.out.println(new String(procesado));
        }
    }
}
