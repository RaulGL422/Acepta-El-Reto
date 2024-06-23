import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class D119 {

    public static void main(String[] args) throws IOException, NullPointerException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;
        int legionarios;
        StringBuilder result = new StringBuilder();
        while (true) {
            legionarios = Integer.parseInt(br.readLine());
            if (legionarios == 0) break;

            int escudos = 0;
            while (legionarios > 0) {
                int ladoCuadrado = (int) Math.sqrt(legionarios);
                int areaCuadrado = ladoCuadrado * ladoCuadrado;
                legionarios -= areaCuadrado;
                escudos += areaCuadrado + (4 * ladoCuadrado);
            }
            result.append(escudos).append('\n');
        }
        out.write(result.toString().getBytes());
    }
    
}

