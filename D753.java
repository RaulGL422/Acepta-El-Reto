import java.util.Scanner;

public class D753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while ((n = sc.nextInt()) != 0) {
            int[] valores = new int[n];
            int suma = 0;
            for (int i = 0; i < n; i++) {
                valores[i] = sc.nextInt();
                suma += valores[i];
            }
            suma >>= 1; // Divide suma entre 2d

            int resultado = calcularPeso(valores, valores.length - 1, suma - valores[valores.length - 1]);

            System.out.println(resultado == 0 ? "SI" : "NO"); 
        }
    }

    private static int calcularPeso(int[] valores, int n, int restante) {
        if (n == 0 || restante == 0) 
            return restante;
        else if (valores[n - 1] > restante) 
            return calcularPeso(valores, n - 1, restante);
        else
            return Math.min(calcularPeso(valores, n - 1, restante), calcularPeso(valores, n - 1, restante - valores[n - 1]));
    }
}