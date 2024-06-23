import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Set;
import java.util.TreeSet;

public class D740 {
    
    private static Set<Integer> list;

    private static void calculaPosibilidades(String numero, String actual, int indice) {
        if (indice == numero.length() - 1) {
            list.add(evaluarSuma(actual + numero.charAt(indice)));
        } else {
            calculaPosibilidades(numero, actual + numero.charAt(indice), indice + 1);
            calculaPosibilidades(numero, actual + numero.charAt(indice) + "+", indice + 1);
        }
    }

    private static int evaluarSuma(String combinacion) {
        String[] partes = combinacion.split("\\+");
        int suma = 0;
        for (String parte : partes) {
            suma += Integer.parseInt(parte);
        }
        return suma;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(br.readLine());
        list = new TreeSet<>();
        StringBuilder result = new StringBuilder();
        while (casos-- != 0) {
            String numero = br.readLine();
            list.add(Integer.parseInt(numero));

            calculaPosibilidades(numero, "", 0);

            for (Integer num : list) {
                result.append(num).append(' ');
            }
            result.replace(result.length() - 1, result.length(), "\n");
            list.clear();
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
}
