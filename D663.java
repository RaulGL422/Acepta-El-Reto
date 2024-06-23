import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class D663 {

    private static int obtNum(InputStream in) throws IOException, NullPointerException, NumberFormatException {
        int num = 0;
        boolean negativo = false;
        int input = in.read();

        if (input == '-') {
            negativo = true;
            input = in.read();
        }

        while (input >= '0' && input <= '9') {
            num = num * 10 + (input - '0');
            input = in.read();
        }

        return negativo ? -num : num;
    }

    private static void writeNum(OutputStream out, int num) throws IOException, NullPointerException, NumberFormatException {
        if (num < 0) {
            out.write('-');
            num = -num;
        }

        int digitCount = 0;
        int[] digits = new int[10];
        do {
            digits[digitCount++] = num % 10;
            num /= 10;
        } while (num > 0);

        for (int i = digitCount - 1; i >= 0; i--) {
            out.write('0' + digits[i]);
        }

        out.write('\n');
    }

    public static void main(String[] args) throws IOException, NullPointerException, NumberFormatException {
        InputStream in = System.in;
        OutputStream out = System.out;
        
        int casos = obtNum(in);
        for (int i = 0; i < casos; i++) {
            int anio = obtNum(in);
            int resultado = anio > 0 ? anio - 1 : anio;
            writeNum(out, resultado);
        }

        out.flush();
    }
}