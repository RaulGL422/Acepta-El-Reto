import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * D127
 */
public class D127 {

    private static StringTokenizer st;
    private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    private static String next() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(entrada.readLine());
        }

        return st.nextToken();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int casos = Integer.parseInt(entrada.readLine());
        String persona;
        LinkedList<String> listaPersonas = new LinkedList<>();
        String salida;
        int elegido = 0;
        while (casos-- != 0) {
            salida = "";
            while (!(persona = next()).equals("F")) listaPersonas.add(persona);
            int camas = Integer.parseInt(next());
            int palabrasCancion = Integer.parseInt(next());

            if (camas != 0) {
                if (camas < listaPersonas.size()) {
                    while (camas-- != 0) {
                        elegido = listaPersonas.size() > palabrasCancion ? listaPersonas.size() % palabrasCancion : palabrasCancion % listaPersonas.size();
                        salida += listaPersonas.get(elegido) + " ";
                        listaPersonas.remove(elegido);
                    }
                    salida = salida.substring(0, salida.length() - 1);
                } else salida = "TODOS TIENEN CAMA";
            } else salida = "NADIE TIENE CAMA";

            System.out.println(salida);
            listaPersonas.clear();
        }
    }


}