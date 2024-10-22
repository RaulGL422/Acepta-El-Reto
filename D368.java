import java.io.IOException;
import java.io.OutputStream;

public class D368 {

    public static void main(String[] args) throws IOException {
        StringBuilder r = new StringBuilder(100);
        int h, c;
        while ((h = readNum()) != 0 && (c = readNum()) != 0) {
            r.append((h / c) * 10 + (h % c == 0 ? 0 : 10)).append('\n');
        }
        OutputStream out = System.out;
        out.write(r.toString().getBytes());
    }

    private static int readNum() throws IOException {
        int n = 0, c;
        while ((c = System.in.read()) > 32) {
            n = n * 10 + (c - '0');
        }
        return n;
    }
}
