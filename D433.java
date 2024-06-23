import java.io.IOException;

public class D433 {

    private static int obtNum() throws IOException, NullPointerException, NumberFormatException {
        int c, num = 0;
        while ((c = System.in.read()) != '\n') {
            num = num * 10 + (c - '0');
        }
        return num;
    }

    public static void main(String[] args) throws IOException, NullPointerException, NumberFormatException {
        int uvas;
        StringBuilder result = new StringBuilder();
        while ((uvas = obtNum()) != 0) {
            int contador = 0, niveles = 0;
            while (contador < uvas) { // Se acumula por cada piso la cantidad de uvas correspondiente
                contador += niveles + 1;
                niveles++;
            }
            result.append(niveles).append('\n');
        }
        System.out.print(result);
    }
}
