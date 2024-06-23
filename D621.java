import java.io.IOException;
import java.io.OutputStream;

public class D621 {

    public static void main(String[] args) throws IOException, NullPointerException, NumberFormatException {
        int casos = obtNum();
        OutputStream out = System.out;
        StringBuilder result = new StringBuilder();
        while (casos-- != 0) {
            int num = obtNum();
            result.append((num % 2 == 0 ? ++num : --num)).append('\n');
        }
        out.write(result.toString().getBytes());
    }

    private static int obtNum() throws IOException, NullPointerException, NumberFormatException {
        int num = 0, input;
        while ((input = System.in.read()) != '\n' ) num = num * 10 + (input - '0');
        return num;
    }
}