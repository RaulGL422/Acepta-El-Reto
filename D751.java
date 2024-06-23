import java.util.Scanner;

public class D751 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt(); // Leer el número de casos de prueba

        while (casos-- > 0) {
            // Leer los años de nacimiento y muerte de las dos personas
            int nacimiento1 = sc.nextInt();
            int muerte1 = sc.nextInt();
            int nacimiento2 = sc.nextInt();
            int muerte2 = sc.nextInt();

            // Encontrar el año de inicio de la coincidencia
            int inicioCoincidencia = Math.max(nacimiento1, nacimiento2);
            int finCoincidencia = Math.min(muerte1, muerte2);

            // Calcular los años de coincidencia
            int anosCoincidencia = 0;
            if (inicioCoincidencia <= finCoincidencia) {
                anosCoincidencia = finCoincidencia - inicioCoincidencia + 1;
            }

            // Imprimir el resultado
            System.out.println(anosCoincidencia);
        }

        sc.close();
    }
}
