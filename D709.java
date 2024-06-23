import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class D709 {

    private static String next() throws IOException, NullPointerException, NumberFormatException {
        StringBuilder palabra = new StringBuilder();
        int input;
        while((input = System.in.read()) != ' ' && input != '\n') palabra.append((char) input);
        return palabra.toString();
    }

    public static void main(String[] args) throws IOException, NullPointerException, NumberFormatException {
        int cantidadVotos, maxVotos;
        OutputStream out = System.out;
        boolean empate;
        Map<String, Integer> votos = new HashMap<>();
        StringBuilder result = new StringBuilder();
        while ((cantidadVotos = Integer.parseInt(next())) != 0) {
            String palabraVoto, palabraMaxVoto = ""; 

            for (int i = 0; i < cantidadVotos; i++) {
                palabraVoto = next();
                if (!votos.containsKey(palabraVoto)) votos.put(palabraVoto, 0);
                votos.put(palabraVoto, votos.get(palabraVoto) + 1);
            }

            maxVotos = 0;
            empate = false;

            for (Map.Entry<String, Integer> entrada : votos.entrySet()) {
                int votosIndividuales = entrada.getValue();
                if (votosIndividuales > maxVotos) {
                    maxVotos = votosIndividuales;
                    palabraMaxVoto = entrada.getKey();
                    empate = false;
                } else if (votosIndividuales == maxVotos) {
                    empate = true;
                }
            }
            result.append(empate ? "EMPATE" : palabraMaxVoto).append('\n');
            votos.clear();
        }
        out.write(result.toString().getBytes());
    }
}