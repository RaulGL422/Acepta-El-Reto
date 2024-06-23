import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class D677 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(entrada.readLine());
        StringBuilder result = new StringBuilder();
        while (casos-- != 0) {
            BigInteger valor = new BigInteger(entrada.readLine());
            result.append(valor.multiply(valor)).append('\n');
        }
        System.out.print(result);
    }
}
