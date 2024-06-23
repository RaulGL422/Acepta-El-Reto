import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D666 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int casos = Integer.parseInt(entrada.readLine());
        while (casos-- != 0) {
            String f1 = entrada.readLine();
            String f2 = entrada.readLine();

            f1 = eliminarCaracteresEspeciales(f1);
            f2 = eliminarCaracteresEspeciales(f2);
            System.out.println(f1.equalsIgnoreCase(f2) ? "SI" : "NO");
        }
    }

    private static String eliminarCaracteresEspeciales(String cadena) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isLetterOrDigit(c)) 
                sb.append(c);
            
        }
        return sb.toString();
    }
}