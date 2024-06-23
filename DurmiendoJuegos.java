import java.util.Scanner;

public class DurmiendoJuegos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int casos = sc.nextInt();
        int puntos, minutosDespierto, puntoGuardado = 0, ultimoPuntoGuardado = 0, sesiones, siguienteSiesta;
        for (int i = 0; i < casos; i++) {
            puntos = sc.nextInt();
            minutosDespierto = sc.nextInt();
            sesiones = 1;
            siguienteSiesta = minutosDespierto;
            for (int punto = 0; punto < puntos; punto++) {
                puntoGuardado = sc.nextInt();
                if (puntoGuardado >= siguienteSiesta) {
                    sesiones++;
                    if (puntoGuardado == siguienteSiesta)
                        siguienteSiesta = puntoGuardado + minutosDespierto;
                    else 
                        siguienteSiesta = ultimoPuntoGuardado + minutosDespierto;
                    
                }
                ultimoPuntoGuardado = puntoGuardado;
            }

            System.out.println(sesiones);
        }
    }
}
