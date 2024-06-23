import java.io.IOException;
import java.io.OutputStream;

public class D715 {
    private static int obtNum() throws IOException, NullPointerException, NumberFormatException {
        int num = 0, c;
        while ((c = System.in.read()) != ' ' && c != '\n') num = num * 10 + (c - '0');
        return num;
    }

    public static void main(String[] args) throws IOException {
        int casos = obtNum();
        StringBuilder result = new StringBuilder();
        while (casos-- != 0) result.append(obtNum() >= obtNum() * 12 ? "SI\n" : "NO\n");
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
}
