import java.io.IOException;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Set;

public class D416 {
    private static String next() throws IOException, NullPointerException, NumberFormatException {
        StringBuilder palabra = new StringBuilder();
        int input;
        while((input = System.in.read()) != '\n' && input != ' ') palabra.append((char) input);
        return palabra.toString();
    }

    public static void main(String[] args) throws NullPointerException, NumberFormatException, IOException {
        Set<String> fechas = new HashSet<>();
        StringBuilder result = new StringBuilder();
        int cantidadFechas;
        while ((cantidadFechas = Integer.parseInt(next())) != 0) {
            boolean nr = true;
            while (cantidadFechas-- != 0) {
                String fecha = next();
                if (!fechas.add(fecha.substring(0, fecha.length() - 5))) {
                    nr = false;
                    break;
                }
            }
            result.append(nr ? "NO\n" : "SI\n");
            fechas.clear();
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
}