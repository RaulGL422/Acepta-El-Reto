import java.util.Scanner;

public class D754 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String palabra = sc.next();
            String resultado = formarPalindromo(palabra);
            System.out.println(resultado);
        }
        
        sc.close();
    }

    private static String formarPalindromo(String palabra) {
        int[] conteoLetras = new int[26]; // Para contar la frecuencia de cada letra
        for (char c : palabra.toCharArray()) {
            conteoLetras[c - 'a']++;
        }

        int cuentaImpares = 0;
        for (int count : conteoLetras) {
            if (count % 2 != 0) {
                cuentaImpares++;
            }
        }

        if (cuentaImpares > 1) {
            return "NO HAY";
        }

        // Crear el palíndromo
        StringBuilder mitadPalindromo = new StringBuilder();
        StringBuilder centro = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            if (conteoLetras[i] % 2 != 0) {
                centro.append((char) (i + 'a'));
            }
            for (int j = 0; j < conteoLetras[i] / 2; j++) {
                mitadPalindromo.append((char) (i + 'a'));
            }
        }

        String mitadIzquierda = mitadPalindromo.toString();
        String mitadDerecha = mitadPalindromo.reverse().toString(); // Invertimos para la mitad derecha

        return mitadIzquierda + centro + mitadDerecha;
    }
}