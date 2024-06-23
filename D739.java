import java.util.Scanner;

public class D739 {
    private static int vVertical(int ap, int alp, int aa, int ala) {
        int ancho = alp / ala;
        if (alp % ala != 0) ancho++;
        int alto = ap / aa;
        if (ap % aa != 0) alto++;
        
        return ancho * alto;
    }

    private static int vHorizontal(int ap, int alp, int aa, int ala) {
        int ancho = alp / aa;
        if (alp % aa != 0) ancho++;
        int alto = ap / ala;
        if (ap % ala != 0) alto++;
        
        return ancho * alto;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        while (casos-- != 0) {
            int ap = sc.nextInt();
            int alp = sc.nextInt();
            int aa = sc.nextInt();
            int ala = sc.nextInt();

            int vertical = vVertical(ap, alp, aa, ala);
            int horizontal = vHorizontal(ap, alp, aa, ala);
            System.out.println(Math.min(horizontal, vertical));
        }
    }
}
