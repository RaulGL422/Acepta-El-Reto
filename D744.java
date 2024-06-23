

import java.util.Scanner;

/**
 * D744
 */
public class D744 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int tiempoMaximo = sc.nextInt();

            int mensajes = 0;
            int tiempoEspera = -1; // Inicializamos en -1 para indicar que no hay un mensaje en espera aún

            while (true) {
                int mensajeActual = sc.nextInt();
                if (mensajeActual == 0) break; // Termina la lectura de un caso cuando se encuentra un 0

                // Si no hay un tiempo en espera o el mensaje actual está fuera del tiempo de espera
                if (tiempoEspera == -1 || mensajeActual > tiempoEspera) {
                    mensajes++; // Necesitamos un nuevo mensaje de agradecimiento
                    tiempoEspera = mensajeActual + tiempoMaximo; // Actualizamos el tiempo de espera
                }
            }

            System.out.println(mensajes); // Imprimimos el número de mensajes para el caso actual
        }

        sc.close();
    }
}
