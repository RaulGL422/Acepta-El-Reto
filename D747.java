import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class D747 {
    private static final int[] dX = {0, 1, 0, -1};
    private static final int[] dY = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int filas = scanner.nextInt();
            int columnas = scanner.nextInt();
            scanner.nextLine(); // Consumir la línea restante

            if (filas == 0 && columnas == 0) {
                break;
            }

            char[][] plaza = new char[filas][columnas];
            for (int i = 0; i < filas; i++) {
                plaza[i] = scanner.nextLine().toCharArray();
            }

            if (sePuedeLlegar(plaza, filas, columnas)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }

    private static boolean sePuedeLlegar(char[][] plaza, int filas, int columnas) {
        boolean[][] visitado = new boolean[filas][columnas];
        Queue<int[]> queue = new LinkedList<>();

        // Empezar en la esquina superior izquierda
        queue.add(new int[]{0, 0});
        visitado[0][0] = true;

        while (!queue.isEmpty()) {
            int[] actual = queue.poll();
            int x = actual[0];
            int y = actual[1];

            // Verificar si hemos llegado a la esquina inferior derecha
            if (x == filas - 1 && y == columnas - 1) {
                return true;
            }

            // Explorar las celdas adyacentes
            for (int i = 0; i < 4; i++) {
                int nuevoX = x + dX[i];
                int nuevoY = y + dY[i];

                if (esValido(nuevoX, nuevoY, filas, columnas) && plaza[nuevoX][nuevoY] == '.' && !visitado[nuevoX][nuevoY]) {
                    queue.add(new int[]{nuevoX, nuevoY});
                    visitado[nuevoX][nuevoY] = true;
                }
            }
        }

        return false;
    }

    private static boolean esValido(int x, int y, int filas, int columnas) {
        return x >= 0 && y >= 0 && x < filas && y < columnas;
    }
}
