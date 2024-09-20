import java.util.Scanner;

public class D657 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt(); // Registra el total de casos de prueba que tendra el programa

        for (int caso = 0; caso < casos; caso++) {
            int anioMayor, anioMenor, anioReferencia;

            anioMenor = sc.nextInt();
            anioReferencia = sc.nextInt();
            anioMayor = sc.nextInt();

            int distanciaMenor = Math.abs(anioMenor - anioReferencia);
            int distanciaMayor = Math.abs(anioMayor - anioReferencia);

            if (anioMenor < 0 && anioReferencia > 0)
                distanciaMenor--;
            
            if (anioReferencia < 0 && anioMayor > 0)
                distanciaMayor--;

            if (distanciaMayor < distanciaMenor) 
                System.out.println(anioMayor);
            else if (distanciaMayor > distanciaMenor)
                System.out.println(anioMenor);
            else
                System.out.println("EMPATE");
        }   
    }
}
