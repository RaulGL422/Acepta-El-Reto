import java.io.IOException;

public class D335 {

    private static int obtNum() throws IOException, NullPointerException, NumberFormatException {
        int c, num = 0;
        while ((c = System.in.read()) != '\n') {
            num = num * 10 + (c - '0');
        }
        return num;
    }

    public static void main(String[] args) throws IOException, NullPointerException, NumberFormatException{
        int pisos, casos;
        long canicasAnterior, canicas;

        casos = obtNum();
        StringBuilder result = new StringBuilder();
        while (casos-- != 0) {
            pisos = obtNum();
            canicas = 0;
            canicasAnterior = 0;
            for (int j = 1; j <= pisos; j++) {
                canicasAnterior += j;
                canicas += canicasAnterior;
            }
            result.append(canicas).append('\n');
        }
        System.out.print(result);
    }
}