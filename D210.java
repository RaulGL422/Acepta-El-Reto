import java.math.BigInteger;
import java.util.Scanner;

public class D210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        sc.nextLine();

        while (casos-- != 0) {
            String palabra = sc.nextLine();
            int suma = 0;
            for (int i = 0; i < palabra.length(); i++) {
                suma += palabra.charAt(i);
            }
            while (!(new BigInteger(String.valueOf(suma)).isProbablePrime(10))) {
                suma--;
            }

            System.out.println(suma);
        }
        sc.close();
    }
}
