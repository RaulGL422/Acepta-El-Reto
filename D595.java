import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D595 {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private static int obtNum() throws IOException {
        int num = 0;
        int input;
        while ((input = reader.read()) != '\n') {
            num = num * 10 + (input - '0');
        }
        return num;
    }

    public static void main(String[] args) throws IOException {
        int casos = obtNum();

        StringBuilder result = new StringBuilder();

        while (casos-- > 0) {
            int num = obtNum();
            result.append(num / 100).append('\n');
        }

        System.out.print(result);
    }
}