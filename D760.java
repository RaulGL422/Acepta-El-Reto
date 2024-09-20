import java.util.Scanner;

public class D760 {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer número de casos de prueba
        int numeroDeCasos = scanner.nextInt();
        for (int i = 0; i < numeroDeCasos; i++) {
            int T = scanner.nextInt();
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            System.out.println(calculatePermutations(T * T, A, B) % MOD);
        }
        
        scanner.close();
    }

    private static long calculatePermutations(int n, int from, int to) {

        long current = 1;
        for (int i = 0; i < from; i++) {
          current = (current * (n - i)) % MOD;
        }
        long result = current;
    
        for (int i = from; i < to; i++) {
          current = (current * (n - i)) % MOD;
          result = (result + current) % MOD;
        }
    
        return result;
      }
}
