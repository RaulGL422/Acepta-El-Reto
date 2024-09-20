import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/**
 * D643
 */
public class D643 {
    private static int obtNum() throws IOException, NullPointerException, NumberFormatException {
        int num = 0;
        int input;
        while ((input = System.in.read()) != '\n' && input != ' ') {
            num = num * 10 + (input - '0');
        }
        return num;
    }

    public static void main(String[] args) throws NumberFormatException, NullPointerException, IOException {
        StringBuilder result = new StringBuilder();
        while (true) {
            int hectometros = obtNum();
            if (hectometros == 0)
                break;

            int segundos = 0;
            int menorTiempo = 0; // Menor tiempo (puntero)
            int menorSegundos;
            int[] arrSegundos = new int[10];
            // Pilla el primer kilometro
            for (int acumulador = 0; acumulador < 10; acumulador++) {
                arrSegundos[acumulador] = obtNum();
                segundos += arrSegundos[acumulador];
            }
            menorSegundos = segundos;
            for (int i = 1; i <= hectometros - 10; i++) {
                segundos -= arrSegundos[0];
                arrSegundos = Arrays.copyOfRange(arrSegundos, 1, 10);
                arrSegundos = Arrays.copyOf(arrSegundos, 10);
                arrSegundos[9] = obtNum();
                segundos += arrSegundos[9];
                if (segundos <= menorSegundos) {
                    menorTiempo = i;
                    menorSegundos = segundos;
                }
            }

            result.append(String.format("%d-%d %d:%02d\n", menorTiempo * 100,
                    (menorTiempo + 10) * 100, menorSegundos / 60,
                    menorSegundos % 60));
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
}