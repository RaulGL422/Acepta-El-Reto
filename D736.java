import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class D736 {

    private static int obtNum(InputStream in) throws IOException {
        int num = 0;
        int input;
        while ((input = in.read()) != '\n' && input != ' ') {
            num = num * 10 + (input - '0');
        }
        return num;
    }

    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        OutputStream out = System.out;
        
        int casos = obtNum(in);
        StringBuilder result = new StringBuilder();

        while (casos-- > 0) {
            int total = obtNum(in);
            int saltos = obtNum(in);
            result.append((total + saltos - 1) / saltos).append('\n');
        }

        out.write(result.toString().getBytes());
        out.flush();
    }
}