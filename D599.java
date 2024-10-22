import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * D599
 */

class Cancion implements Comparable<Cancion> {
    private int duracion;
    private int puntuacion;

    public Cancion(int duracion, int puntuacion) {
        this.duracion = duracion;
        this.puntuacion = puntuacion;
    }

    @Override
    public int compareTo(Cancion o) {
        return o.puntuacion - this.puntuacion;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }
}

public class D599 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int casets = sc.nextInt();
            if (casets == 0)
                break;

            int duracionCara = sc.nextInt();

            List<Cancion> canciones = new ArrayList<>()

          
            while (casets-- != 0) {
                canciones.add(new Cancion(sc.nextInt(), sc.nextInt()));
            }

            Collections.sort(canciones);

            int puntuacionTotal = 0;
            Cancion[] arrCanciones = new Cancion[canciones.size()];
            arrCanciones = canciones.toArray(arrCanciones);
            for (int i = 0; i < 2; i++) {
                int duracionRestante = duracionCara;

                for (int j = 0; j < arrCanciones.length; j++) {
                    if (arrCanciones[j] != null && duracionRestante >= arrCanciones[j].getDuracion()) {
                        puntuacionTotal += arrCanciones[j].getPuntuacion();
                        duracionRestante -= arrCanciones[j].getDuracion();
                        arrCanciones[j] = null;
                    }
                }
            }
            System.out.println(puntuacionTotal);
        }
    }
}