import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D317 {
    private static int MOD = 1_000_000_007;

    private static int countDecodings(String encryptedMessage, Set<String> codes) {
        int[] dp = new int[encryptedMessage.length() + 1];
        dp[0] = 1; // Hay una única forma de decodificar un mensaje vacío

        // Iterar sobre el mensaje cifrado
        for (int i = 1; i <= encryptedMessage.length(); i++) {
            // Verificamos todos los segmentos posibles de longitud variable
            for (int j = i - 1; j >= 0; j--) {
                
                String segment = encryptedMessage.substring(j, i);
                if (codes.contains(segment)) {
                    dp[i] = (dp[i] + dp[j]) % MOD;
                }
            }
        }

        // El resultado será el número de formas de decodificar todo el mensaje
        return dp[encryptedMessage.length()];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int cantidadDigitos = sc.nextInt();
            if (cantidadDigitos == 0) break;

            Set<String> codes = new HashSet<>();
            for (int i = 0; i < cantidadDigitos; i++) {
                codes.add(sc.next());
            }

            String cadena = sc.next();

            System.out.println(countDecodings(cadena, codes));
        }
        sc.close();
    }
}
