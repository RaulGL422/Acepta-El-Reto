import java.io.IOException;
import java.io.OutputStream;

public class D138 {
    private static int obtNum() throws IOException, NullPointerException, NumberFormatException {
        int input, num = 0;
        while((input = System.in.read()) != '\n') num = num * 10 + (input - '0');
        return num;
    }

    public static void main(String[] args) throws NumberFormatException, NullPointerException, IOException {
        int casos = obtNum();
        StringBuilder result = new StringBuilder();
        while (casos-- != 0) {
            int num = obtNum();
            int division = num / 5;
            int ceros = 0;
            while (division > 0) {
                ceros += division;
                division = division / 5;
            }
            result.append(ceros).append('\n');
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
}
