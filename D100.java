import java.io.IOException;
import java.util.Arrays;

public class D100 {

    private static int obtNum() throws IOException {
        int numero = 0, input;
        while ((input = System.in.read()) != '\n') numero = numero * 10 + (input - '0');
        return numero;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int casos = obtNum();
        StringBuilder result = new StringBuilder();
        while (casos-- != 0) {
            int numero = obtNum();
            int iteraciones, resta;
            
            for (iteraciones = 0; numero != 6174; iteraciones++) {
                int[] numeroDividido = {0,0,0,0};
                for (int j = 0; j < 4; j++) {
                    numeroDividido[j] = numero % 10;
                    numero /= 10;
                }
                Arrays.sort(numeroDividido);
                int ordenado = 0, desordenado = 0;
                for (int num = 0; num < 4; num++) {
                    ordenado = ordenado * 10 + numeroDividido[num];
                    desordenado = desordenado * 10 + numeroDividido[3 - num];
                }

                resta = desordenado - ordenado;
                if (resta == 0) {iteraciones = 8; break;}
                numero = resta;
            }
            result.append(iteraciones).append('\n');
        }
        System.out.print(result);
    }


}
