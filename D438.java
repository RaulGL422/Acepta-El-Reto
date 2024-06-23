import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D438 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String mensaje;
        while ((mensaje = entrada.readLine()) != null) {
            int contadorExclamaciones = 0, contadorLetras = 0;
            for (int i = 0; i < mensaje.length(); i++) {
                char c = mensaje.charAt(i);
                if (Character.isLetter(c))
                    contadorLetras++;
                else if (c == '!')
                    contadorExclamaciones++;
            }
            System.out.println(contadorLetras < contadorExclamaciones ? "ESGRITO" : "escrito");
        }
    }
}
