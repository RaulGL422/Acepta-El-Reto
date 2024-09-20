import java.util.Arrays;
import java.util.Scanner;

public class D650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int libros = sc.nextInt();
            int[] arrLibros = new int[libros];

            for (int i = 0; i < arrLibros.length; i++) {
                arrLibros[i] = sc.nextInt();
            }

            Arrays.sort(arrLibros);
            int descuento = 0;
            for (int i = arrLibros.length - 3; i >= 0; i -= 3) {
                descuento += arrLibros[i];
            }
            System.out.println(descuento);
        }
    }
}
