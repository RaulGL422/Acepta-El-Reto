import java.io.IOException;
import java.io.OutputStream;

public class D710 {

    private static int obtNum() throws IOException, NullPointerException, NumberFormatException {
        int input, num = 0;
        while((input = System.in.read()) != '\n' && input != ' ') num = num * 10 + (input - '0');
        return num;
    }

    public static void main(String[] args) throws NumberFormatException, NullPointerException, IOException {
        int casos, plazasRepesca, continente;
        casos = obtNum();
        StringBuilder result = new StringBuilder();
        while (casos-- != 0) {
            continente = 6;
            plazasRepesca = obtNum();
            while (continente-- != 0) plazasRepesca -= obtNum();
            result.append(plazasRepesca).append('\n');
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
}
