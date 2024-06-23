import java.io.IOException;
import java.util.Arrays;

public class D720 {

    private static long obtNum() throws IOException {
        int input;
        long num = 0;
        while ((input = System.in.read()) != '\n' && input != ' ') {
            if (input == -1) return input;
            num = num * 10 + (input - '0');
        };
        return num;
    }

    private static boolean verificarOrden(long[] vector) {
        long numero = 0;
        for (int i = 0; i < vector.length; i++) {
            if (numero > vector[i]) return false;
            numero = vector[i];
        }
        return true;
    }

    private static long[] chuckNorrisCabron(long[] vector) {
        if (verificarOrden(vector))
            return vector;
        return chuckNorrisCabron(Arrays.copyOfRange(vector, vector.length % 2 == 0 ? vector.length / 2 : vector.length / 2 + 1, vector.length - 1));
    } 

    public static void main(String[] args) throws IOException {
        int numeros;
        StringBuilder result = new StringBuilder();
        while ((numeros = (int) obtNum()) != -1) {
            long[] vector = new long[numeros];
            for (int i = 0; i < vector.length; i++) {
                vector[i] = obtNum();
            }
            result.append(chuckNorrisCabron(vector).length).append('\n');
        }
        System.out.print(result);
    }
}