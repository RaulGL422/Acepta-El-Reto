import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class D399 {

    private static int obtNum() throws IOException {
        int input, num = 0;
        while ((input = System.in.read()) != '\n' && input != ' ') num = num * 10 + (input - '0');
        return num;
    }

    public static void main(String[] args) throws IOException {
        StringBuilder result = new StringBuilder();
        Map<Integer, Integer> mapa = new TreeMap<>();
        while (true) {
            int max = 0;
            int bola;
            int[] collar;
            int contador = 0;
            while (true) {
                bola = obtNum();
                if (bola == 0) break;
                max = (max < bola) ? bola : max;
                if (!mapa.containsKey(bola)) mapa.put(bola, 1);
                else mapa.put(bola, mapa.get(bola) + 1);
                contador++;
            }

            boolean puede = true;
            if (mapa.isEmpty()) break;
            collar = new int[contador];
            if (contador % 2 == 0) puede = false;
            else {
                boolean impar = false;
                
                int acumulador = 0;
                for (int i : mapa.keySet()) {
                    int cantidad = mapa.get(i);
                    if (cantidad % 2 != 0) {
                        if (impar) {puede = false; break;}
                        else {
                            impar = true;
                            collar[collar.length / 2] = i;
                        }
                    } else {
                        while (cantidad != 0) {
                            collar[acumulador] = i;
                            collar[collar.length - 1 - acumulador] = i;
                            cantidad -= 2;
                            acumulador++;
                        }
                    }
                }
            }
            if (puede) {
                String salida = "";
                for (int i = 0; i < collar.length; i++) salida += collar[i] + " ";
                result.append(salida.substring(0, salida.length() - 1)).append('\n');
            } else result.append("NO\n");
            
            mapa.clear();
        }
        System.out.print(result);
    }
}
