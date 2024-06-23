import java.io.IOException;

public class D613 {

    private static int obtNum() throws IOException {
        int input, num = 0;
        while((input = System.in.read()) != '\n') {
            num = num * 10 + (input - '0');
            if (input == -1) return input;
        }
        return num;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        StringBuilder result = new StringBuilder();
        int numeroBase, cifras = 1;
        long numero = 1;
        while ((numeroBase = obtNum()) != -1) {
            while (numero % numeroBase != 0) {
                numero = numero * 10 + 1;
                cifras++;
            }
            result.append(cifras).append('\n');
            System.out.print(result);
        }
        
    }
}