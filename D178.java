import java.util.Scanner;

public class D178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < casos; i++) {
            boolean mensajeCorrecto = true;
            String titular = sc.nextLine().toLowerCase();
            String mensajeOculto = sc.nextLine().toLowerCase().replace(" ", "");
            char[] listaMensajeOculto = mensajeOculto.toCharArray();

            int posicionMinima = 0;

            for (char caracter : listaMensajeOculto) {
                int posicionBuscada = titular.indexOf(caracter, posicionMinima);

                if (posicionBuscada == -1){
                    mensajeCorrecto = false;
                    break;
                }

                posicionMinima = posicionBuscada + 1;
            }
            String salidas = mensajeCorrecto ? "SI" : "NO";

            System.out.println(salidas);
        }
    }
}
