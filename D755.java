import java.math.BigInteger;
import java.util.Scanner;

public class D755 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        while (casos-- != 0) {
            BigInteger ancho = sc.nextBigInteger();
            BigInteger alto = sc.nextBigInteger();
            BigInteger mcd = ancho.gcd(alto);
            System.out.println(ancho.divide(mcd).multiply(alto.divide(mcd))); // (ancho / mcd) * (alto / mcd)
        }
    }
}
