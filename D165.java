import java.io.IOException;
import java.io.OutputStream;

public class D165 {
    private static int obtNum() throws IOException, NullPointerException, NumberFormatException {
        int input, num = 0;
        while ((input = System.in.read()) != '\n') num = num * 10 + (input - '0');
        return num;
    }

    public static void main(String[] args) throws NumberFormatException, NullPointerException, IOException {
        int numero;
        StringBuilder result = new StringBuilder();
        while ((numero = obtNum()) >= 0) {
            boolean hyperpar = true;
            while (numero > 0) {
                if (((numero % 10) & 1) != 0) {hyperpar = false; break;}
                numero /= 10;
            }
            result.append(hyperpar ? "SI\n" : "NO\n");
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
}