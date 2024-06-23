import java.util.Scanner;

public class D750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int numero = sc.nextInt();
            int contadorCeros = 0;
            String trans;
            if (numero == 0) break;

            while (numero >= 10) {
                trans = String.valueOf(numero);
                numero = trans.charAt(0) - '0';
                for (int i = 1; i < trans.length(); i++) {
                    if (trans.charAt(i) != '0')
                        numero *= trans.charAt(i) - '0';
                    else
                        contadorCeros++;
                }
            }
            System.out.println(numero + "" + contadorCeros);
        }
    }
}
