import java.io.IOException;
import java.util.Scanner;

/**
 * D310
 */
public class D310 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        while (casos-- != 0) {
            System.out.println(arbol(sc.nextInt(), sc));
        }
    }

    private static int arbol(int num, Scanner sc) throws IOException {
        int nivel = 1;
        int nivelMax = 0;
        for (int i = 0; i < num; i++) {
            int ramas = sc.nextInt();
            nivelMax = Math.max(nivelMax, arbol(ramas, sc));
        }
        return nivel + nivelMax;
    }
}