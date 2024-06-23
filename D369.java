import java.io.IOException;
import java.util.Arrays;

public class D369 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int numero = 0, input;
        StringBuilder result = new StringBuilder();
        while (true) {
            while ((input = System.in.read()) != '\n') {
                numero = numero * 10 + (input - '0');
            }
            if (numero == 0) break;
            char[] caracteres = new char[numero];
            Arrays.fill(caracteres, '1');
            result.append(new String(caracteres)).append('\n');
            numero = 0;
        }
        System.out.print(result);
    }
}