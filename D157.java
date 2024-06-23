import java.io.IOException;
import java.io.OutputStream;

public class D157 {

    private static int obtNum() throws IOException, NullPointerException, NumberFormatException {
        int input, num = 0;
        while((input = System.in.read()) != '\n' && input != ' ') num = num * 10 + (input - '0');
        return num;
    }
    
    private static final int[] MESES = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
    private static final int[] SUMA_MESES_PREVIOS = precalcularSumaMesesPrevios();

    public static void main(String[] args) throws NumberFormatException, NullPointerException, IOException {
        int casos = obtNum();
        StringBuilder result = new StringBuilder();
        while (casos-- != 0) {
            int dias = obtNum();
            int mes = obtNum();
            if (mes == 1) result.append(365 - dias);
            else result.append(365 - (dias + SUMA_MESES_PREVIOS[mes - 2]));
            result.append('\n');
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }

    private static int[] precalcularSumaMesesPrevios() {
        int[] sumaMesesPrevios = new int[11];
        sumaMesesPrevios[0] = MESES[0];
        for (int i = 1; i < 11; i++) sumaMesesPrevios[i] = sumaMesesPrevios[i - 1] + MESES[i];
        return sumaMesesPrevios;
    }
}
