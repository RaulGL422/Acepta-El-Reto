
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class D152 {

    private static int obtNum() throws IOException, NullPointerException, NumberFormatException {
        int input, num = 0;
        while((input = System.in.read()) != '\n' && input != ' ') num = num * 10 + (input - '0');
        return num;
    }

    public static void main(String[] args) throws IOException, NullPointerException, NumberFormatException {
        Map<Integer, Integer> mapa = new HashMap<>();
        StringBuilder result = new StringBuilder();
        int num;
        while ((num = obtNum()) != 0) {
            while (num-- != 0) {
                int numero = obtNum();
                if (!mapa.containsKey(numero))
                    mapa.put(numero, 1);
                else 
                    mapa.put(numero, mapa.get(numero) + 1);
            }

            int keyMayor = 0, valorMayor = 0;
            for (Map.Entry<Integer, Integer> numero : mapa.entrySet()) {
                if (numero.getValue() > valorMayor) {
                    keyMayor = numero.getKey();
                    valorMayor = numero.getValue();
                }
            }

            result.append(keyMayor).append('\n');
            mapa.clear();
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
}