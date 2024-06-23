

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
 * D205
 */
public class D205 {

    private static int invertir(int numero) {
        int invertido = 0;
        while (numero > 0) {
            invertido = invertido * 10 + numero % 10;
            numero /= 10;
        }
        return invertido;
    }

    private static boolean esCapicua(int numero) {
        return numero == invertir(numero);
    }

    public static void main(String[] args) throws NumberFormatException, NullPointerException, IOException {
        OutputStream out = System.out;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(br.readLine());
        while (casos-- != 0) {
            StringBuilder result = new StringBuilder();
            int numero = Integer.parseInt(br.readLine());
            int iteraciones = 0;
            while (true) {
                numero = numero + invertir(numero);
                iteraciones++;
                if (numero >= 1000000000 || esCapicua(numero)) break;
            }
            if (numero >= 1000000000)
                result.append("Lychrel?\n");
            else
                result.append(iteraciones).append(' ').append(numero).append('\n');
            out.write(result.toString().getBytes());
        }
        
        
    }
}