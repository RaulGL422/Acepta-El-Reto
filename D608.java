import java.util.Scanner;

public class D608 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int temperaturas = sc.nextInt();
            if (temperaturas == 0) break;
            int avisos = 0;
            boolean puedePitar = true;
            for (int i = 0; i < temperaturas; i++) {
                int temperatura = sc.nextInt();
                if (temperatura <= 4 && puedePitar) {
                    avisos++;
                    puedePitar = false;
                } else if (temperatura > 6 && !puedePitar) {
                    puedePitar = true;
                }
            }
            System.out.println(avisos);
        }
    }
}
