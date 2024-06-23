import java.io.IOException;
import java.io.OutputStream;

public class D635 {

    private static int obtNum() throws IOException, NullPointerException, NumberFormatException {
        int input, num = 0;
        while ((input = System.in.read()) != '\n') num = num * 10 + (input - '0');
        return num;
    }
    
    public static void main(String[] args) throws IOException, NullPointerException, NumberFormatException {
        int casos = obtNum();
        StringBuilder result = new StringBuilder();
        while (casos-- != 0) {
            int anio = obtNum();
            result.append(anio % 100 > 0 ? anio / 100 + 1 : anio / 100 ).append('\n');
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
}
