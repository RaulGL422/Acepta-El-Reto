import java.util.Scanner;

/**
 * D759
 */
public class D758 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        while (casos-- != 0) {
            int n = sc.nextInt();
            int negras = ((n - 1) * 2 - 1) + n * 4 - 6;
            int blancas = (int) Math.pow(n, 2) - negras;
            System.out.println(negras + " " + blancas);
        }
    }
}