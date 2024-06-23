/* 404 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Meucci
 */
public class Meucci {

    public static void main(String[] args) throws IOException {
        String[] posibilidades = {"X", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String numero;
        while ((numero = entrada.readLine()) != null) {
            int contador = 0;
            for (String posibilidad : posibilidades) {
                if (numero.contains(posibilidad)) contador++;
            }
            System.out.println(contador);
        }
    }
}