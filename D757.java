import java.util.Scanner;

public class D757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        while (casos-- != 0) {
            char[] linea = sc.next().toCharArray();
            int maximoContador = 0;
            int contador = 0;
            for (int i = 0; i < linea.length; i++) {
                char c = linea[i];
                
                if (c == 'T') contador++;
                else contador = 0;
                if (contador > maximoContador) {
                    maximoContador = contador;
                }
            }
            System.out.println(maximoContador);
        }
    }
}
