import java.io.IOException;
import java.io.OutputStream;

public class D314 {

    private static int obtNum() throws IOException, NullPointerException, NumberFormatException {
        int input, num = 0;
        boolean n = false;
        while((input = System.in.read()) != '\n' && input != ' ') {
            if (input == '-' && num == 0) n = true;
            else num = num * 10 + (input - '0'); 
        }
        return n ? num * -1 : num;
    }
    public static void main(String[] args) throws IOException, NullPointerException, NumberFormatException {
        int casos = obtNum();
        StringBuilder result = new StringBuilder();
        OutputStream out = System.out;
        while (casos-- != 0) {
            int valle = 0, picos = 0;
            int cantidad = obtNum();
            int numAnterior = obtNum();
            int numActual = 0;
            boolean probableV = false, probableP = false;
            for (int i = 1; i < cantidad - 1; i++) {
                numActual = obtNum();

                if (probableP && numAnterior > numActual) {
                    picos++;
                } else if (probableV && numAnterior < numActual) {
                    valle++;
                }   

                probableP = false;
                probableV = false;

                if (numActual > numAnterior) {
                    probableP = true;
                } else if (numActual < numAnterior) {
                    probableV = true;
                }

                numAnterior = numActual;
            }
            if (probableP && numAnterior > numActual) {
                picos++;
            } else if (probableV && numAnterior < numActual) {
                valle++;
            }   
            result.append(picos).append(' ').append(valle).append('\n');
        }
        out.write(result.toString().getBytes());
    }
}
