import java.util.Scanner;

public class D752 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int personas, vagones;
        while ((personas = sc.nextInt()) != 0 && (vagones = sc.nextInt()) != 0) {
            int[] tren = new int[vagones];
            for (int i = 0; i < tren.length; i++) {
                tren[i] = sc.nextInt();
            }

            int li = 0, ld = 0, vi = 0, tamanio;
            int suma = tren[0];
            while (suma < personas && ld < vagones - 1) {
                ld++;
                suma += tren[ld];
            }
            tamanio = ld + 1;

            if (suma >= personas) {
                while (li < vagones - 1) {
                    suma -= tren[li];
                    li++;
                    if (suma >= personas) {
                        tamanio = ld - li + 1;
                        vi = li;
                    } else if (ld < vagones - 1) {
                        ld++;
                        suma += tren[ld];
                        if (suma >= personas && tamanio != ld - li + 1) {
                            tamanio = ld - li + 1;
                            vi = li;
                        }
                    }
                }
                System.out.println(tamanio + " " + ++vi);
            } else System.out.println("NO ENTRAN");
        }

    }
}