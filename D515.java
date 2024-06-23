import java.io.IOException;
import java.io.OutputStream;

public class D515 {

    private static int obtNum() throws IOException, NullPointerException, NumberFormatException {
        int input, num = 0;
        while((input = System.in.read()) != '\n') num = num * 10 + (input - '0');
        return num;
    }

    public static void main(String[] args) throws IOException, NullPointerException, NumberFormatException {
        OutputStream out = System.out;
        StringBuffer result = new StringBuffer();
        int numCopas;
        
        while ((numCopas = obtNum()) != 0) {
            int paseos = (numCopas & 1) == 0 ? numCopas : numCopas - 1; 
            result.append(paseos == 0 ? 1 : paseos).append('\n');
        }

        out.write(result.toString().getBytes());
    }


}