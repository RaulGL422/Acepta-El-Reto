import java.math.BigInteger;
import java.util.Scanner;

public class D741 {
    private static BigInteger suma(int pisos) {
        BigInteger resultado = new BigInteger(String.valueOf(pisos));  
        resultado = resultado.multiply(new BigInteger(String.valueOf(pisos + 1)));
        return resultado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        while (casos-- != 0) {
            int pisos = sc.nextInt();
            BigInteger r = suma(pisos - 1).divide(new BigInteger(String.valueOf(2)));
            BigInteger resultado = suma(pisos).add(r);
            System.out.println(resultado);
        }
    }
}
