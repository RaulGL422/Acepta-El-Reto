

import java.io.IOException;
import java.io.OutputStream;
/**
 * D743
 */
public class D743 {

    private static int obtNum() throws IOException, NullPointerException, NumberFormatException {
        int input, num = 0;
        while((input = System.in.read()) != '\n' && input != ' ') {
            num = num * 10 + (input - '0'); 
        }
        return num;
    }

    public static void main(String[] args) throws IOException {
        int cantDocumentos;
        StringBuilder result = new StringBuilder();
        while ((cantDocumentos = obtNum()) != 0) {
            int ahorradas = 0;
            for (int i = 0; i < cantDocumentos; i++) {
                ahorradas += obtNum() / 2;
            }
            result.append(ahorradas).append('\n');
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
}