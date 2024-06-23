

import java.util.Scanner;

public class D742 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        while (casos-- != 0) {
            String cadena = sc.next();
            int longitud = cadena.length();
            int balas = 0;
            int posicionesSeguras = 0;

            for (int i = 0; i < longitud; i++) {
                if (cadena.charAt(i) == '1') {
                    balas++;
                } else {
                    int posicionSiguiente = (i + 1) % longitud;
                    if (cadena.charAt(posicionSiguiente) == '0') {
                        posicionesSeguras++;
                    }
                }
            }

            // Calcular probabilidad de sobrevivir si no gira
            double probabilidadNoGirar = (double) posicionesSeguras / (longitud - balas);

            // Calcular probabilidad de sobrevivir si gira
            double probabilidadGirar = (double) (longitud - balas) / longitud;

            if (probabilidadNoGirar > probabilidadGirar) {
                System.out.println("No girar");
            } else if (probabilidadNoGirar < probabilidadGirar) {
                System.out.println("Girar");
            } else {
                System.out.println("Da igual");
            }
        }

        sc.close();
    }
}
