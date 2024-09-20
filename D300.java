import java.util.Scanner;

/**
 * D300
 */
public class D300 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        while (casos-- != 0) {
            String palabra = sc.next();
            if (palabra.indexOf("a") != -1 && 
                palabra.indexOf("e") != -1 &&
                palabra.indexOf("i") != -1 && 
                palabra.indexOf("o") != -1 &&
                palabra.indexOf("u") != -1) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}