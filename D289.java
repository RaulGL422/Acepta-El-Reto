import java.io.IOException;
import java.io.OutputStream;
import java.util.PriorityQueue;
import java.util.Queue;

public class D289 {

    private static long obtNum() throws IOException, NullPointerException, NumberFormatException {
        int input;
        long num = 0;
        while((input = System.in.read()) != '\n' && input != ' ') num = num * 10 + (input - '0');
        return num;
    }

    public static void main(String[] args) throws IOException, NullPointerException, NumberFormatException {
        Queue<Long> listaPrioridad = new PriorityQueue<>();
        int numeros;
        StringBuilder result = new StringBuilder();
        while ((numeros = (int) obtNum()) != 0) {
            long esfuerzoAcumulado = 0;
            long esfuerzo;
            
            for (int i = 0; i < numeros; i++) listaPrioridad.add(obtNum());
            if (numeros != 1) {
                while (!listaPrioridad.isEmpty()) {
                    esfuerzo = listaPrioridad.poll() + listaPrioridad.poll();
                    if (!listaPrioridad.isEmpty()) listaPrioridad.add(esfuerzo);
                    esfuerzoAcumulado += esfuerzo;
                }
            }
            result.append(esfuerzoAcumulado).append('\n');
            listaPrioridad.clear();
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
} 