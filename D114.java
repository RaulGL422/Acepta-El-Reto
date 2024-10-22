import java.io.IOException;
import java.io.OutputStream;

public class D114 {
    private static int obtNum() throws IOException, NullPointerException, NumberFormatException {
        int input, num = 0;
        while ((input = System.in.read()) != '\n') num = num * 10 + (input - '0');
        return num;
    }

    public static void main(String[] args) throws IOException, NullPointerException, NumberFormatException {
        int casos = obtNum();
        OutputStream out = System.out;
        StringBuilder result = new StringBuilder();
        while (casos-- != 0) {
            int num = obtNum();
            result.append(num >= 5 ? 0 : num == 3 ? 6 : num == 0 ? 1 : num).append('\n');
        }
        
        out.write(result.toString().getBytes());
    }
}