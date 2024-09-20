import java.util.Scanner;

public class D762 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            int pianoAncho = scanner.nextInt();
            int pianoLargo = scanner.nextInt();
            int pasilloAncho1 = scanner.nextInt();
            int pasilloAncho2 = scanner.nextInt();

            if (sePuedeTrasladar(pianoAncho, pianoLargo, pasilloAncho1, pasilloAncho2)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }

    private static boolean sePuedeTrasladar(int pianoAncho, int pianoLargo, int pasilloAncho1, int pasilloAncho2) {
        // Asegurarse de que el lado más corto del piano es empujado por el pasillo
        int ladoCortoPiano = Math.min(pianoAncho, pianoLargo);
        int ladoLargoPiano = Math.max(pianoAncho, pianoLargo);

        // Calcular la diagonal del piano
        double diagonalPiano = Math.sqrt(pianoAncho * pianoAncho + pianoLargo * pianoLargo);

        // Verificar si el piano puede girar en la esquina del pasillo
        return (ladoCortoPiano <= pasilloAncho1 && ladoLargoPiano <= pasilloAncho2) ||
               (ladoCortoPiano <= pasilloAncho2 && ladoLargoPiano <= pasilloAncho1) ||
               (diagonalPiano <= pasilloAncho1 + pasilloAncho2);
    }

}
