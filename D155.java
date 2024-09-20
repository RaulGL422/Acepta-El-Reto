import java.util.Scanner;

public class D155 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int ancho = sc.nextInt();
            int alto = sc.nextInt();
            if (ancho < 0 || alto < 0) break;
            System.out.println(ancho * 2 + alto * 2);
        }
    }
}
