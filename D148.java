import java.io.IOException;
import java.io.OutputStream;

public class D148 {
    private static int obtNum() throws IOException, NullPointerException, NumberFormatException {
        int num = 0, c;
        while ((c = System.in.read()) != ':' && c != '\n') num = num * 10 + (c - '0');
        return num;
    }

    private final static int totalMin = 1440;

    public static void main(String[] args) throws NumberFormatException, NullPointerException, IOException {
        int min = 0, hora;
        StringBuilder result = new StringBuilder();
        while (true) {
            hora = obtNum();
            min = obtNum();
            if (hora == 0 && min == 0) break;
            min += hora * 60;
            result.append(totalMin - min).append('\n');
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
}
