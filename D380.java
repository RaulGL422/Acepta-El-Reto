import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class D380 {

    private static int obtNum() throws IOException, NullPointerException, NumberFormatException {
        int input, num = 0;
        while((input = System.in.read()) != '\n' && input != ' ') num = num * 10 + (input - '0');
        return num;
    }

    public static void main(String[] args) throws IOException {
        int gastos;
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        while ((gastos = obtNum()) != 0) {
            int sumaGastos = 0;
            while (gastos-- != 0) {
                sumaGastos += obtNum();
            }
            writer.write(sumaGastos);
            writer.write('\n');
        }
        writer.flush();
    }
}
