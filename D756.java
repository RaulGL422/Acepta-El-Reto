import java.util.Scanner;

public class D756 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int[] numeros = new int[16];
            for (int i = 0; i < 16; i++) {
                numeros[i] = sc.nextInt();
            }
            int inversiones = 0;
            for (int i = 0; i < numeros.length; i++) {
                for (int j = i - 1; j >= 0; j--) {
                    if (numeros[i] < numeros[j]) {
                        inversiones++;
                    }
                }
            }

            System.out.println(inversiones % 2 == 0 ? "SI" : "NO");
        }
    }
}
