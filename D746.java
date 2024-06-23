import java.util.Arrays;
import java.util.Scanner;

public class D746 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int guirnaldas = sc.nextInt();
            int distancia = sc.nextInt();
            if (guirnaldas == 0 && distancia == 0) break;
            int[] arrGuirnaldas = new int[guirnaldas];
            for (int i = 0; i < guirnaldas; i++) {
                arrGuirnaldas[i] = sc.nextInt();
            }
            Arrays.sort(arrGuirnaldas);
            int parejas = 0;
            int left = 0;
            int right = arrGuirnaldas.length - 1;
            
            while (left < right) {
                int sum = arrGuirnaldas[left] + arrGuirnaldas[right];
                if (sum == distancia) {
                    parejas++;
                    left++;
                    right--;
                } else if (sum < distancia) {
                    left++;
                } else {
                    right--;
                }
            }

            System.out.println(parejas);
        }
    }
    
}
