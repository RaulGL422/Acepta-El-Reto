import java.io.IOException;
import java.io.OutputStream;

public class D140 {

    private static int obtNum() throws IOException, NullPointerException, NumberFormatException {
        int input, num = 0;
        while((input = System.in.read()) != '\n') num = num * 10 + (input - '0');
        return num;
    }

    private static int multiplo10(int numero, int cifrasRestantes) {
        return --cifrasRestantes != 0 ? multiplo10(numero * 10, cifrasRestantes) : numero;
    }

    public static void main(String[] args) throws NumberFormatException, NullPointerException, IOException {
        int numero;
        StringBuilder result = new StringBuilder();
        while ((numero = obtNum()) >= 0) {
            int digito;
            int suma = 0;
            int cifras = Integer.toString(numero).length();
            if (numero != 0) {
                while (cifras != 0) {
                    int numero10 = multiplo10(1, cifras);
                    digito = numero / numero10;
                    numero %= numero10;
                    cifras--;
                    suma += digito;
                    result.append(digito + (cifras != 0 ? " + " : " = "));
                }
                result.append(suma);
            } else
                result.append("0 = 0");
            result.append('\n');
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
}
