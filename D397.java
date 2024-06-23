import java.io.IOException;
import java.io.OutputStream;

public class D397 {
    private static int next() throws IOException, NullPointerException, NumberFormatException {
        int input, num = 0;
        while((input = System.in.read()) != '\n') num = num * 10 + (input - '0');
        return num;
    }

    public static void main(String[] args) throws IOException, NullPointerException, NumberFormatException {
        OutputStream out = System.out;
        int casos = next();
        StringBuilder result = new StringBuilder();
        while (casos-- != 0) result.append(next() % 3 != 1 ? "SI\n" : "NO\n");
        out.write(result.toString().getBytes());
    }
}
