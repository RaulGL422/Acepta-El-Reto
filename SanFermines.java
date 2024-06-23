import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SanFermines {
    public static void main(String[] args) throws NumberFormatException, IOException { 
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String datosToros;
        int velMaxima = 0, velocidad;

        while ((datosToros = entrada.readLine()) != null) {
            String[] dividido = datosToros.split(" ");
            for (int i = 1; i < dividido.length; i++) {
                velocidad = Integer.parseInt(dividido[i]);
                if (velocidad > velMaxima) velMaxima = velocidad;
            }
            System.out.println(velMaxima);
        }
    }
}