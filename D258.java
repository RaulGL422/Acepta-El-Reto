import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class D258 {

    private static int obtNum() throws IOException, NullPointerException, NumberFormatException {
        int input, num = 0;
        while((input = System.in.read()) != '\n' && input != ' ') num = num * 10 + (input - '0');
        return num;
    }

    public static void main(String[] args) throws NumberFormatException, NullPointerException, IOException {
        int personas, tamanioVentana;
        StringBuilder result = new StringBuilder();
        while ((personas = obtNum()) != 0 && (tamanioVentana = obtNum()) != 0) {

            int[] arrayPersonas = new int[tamanioVentana];

            for (int i = 0; i < tamanioVentana; i++) arrayPersonas[i] = obtNum();

            int cantResultados = personas - tamanioVentana + 1;
            while (cantResultados-- != 0) {
                int max = 0;
                for (int i = 0; i < tamanioVentana; i++) {
                    if (arrayPersonas[i] > max) max = arrayPersonas[i];
                }
                
                if (cantResultados != 0) {
                    arrayPersonas = Arrays.copyOfRange(arrayPersonas, 1, arrayPersonas.length);
                    arrayPersonas = Arrays.copyOf(arrayPersonas, arrayPersonas.length + 1);
                    arrayPersonas[tamanioVentana - 1] = obtNum();
                }

                result.append(max).append(' ');
            }
            result.append('\n');
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
}
