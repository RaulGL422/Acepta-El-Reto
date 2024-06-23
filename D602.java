import java.util.Scanner;

public class D602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        while (casos-- != 0) {
            int necesario = sc.nextInt();
            int acumulado = 2;
            int dias = 2;
            int hoy = 0;
            int diaA = 1;
            int diaAA = 1;
            if (necesario <= 2) {
                System.out.println(necesario);
            } else {
                while (acumulado < necesario) {
                    hoy = diaAA * 2 + diaA;
                    acumulado += hoy;
                    diaAA = diaA;
                    diaA = hoy;
                    dias++;
                }
                System.out.println(dias);
            }
           
        }
    }
}
