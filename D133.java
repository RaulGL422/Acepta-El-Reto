import java.util.Scanner;

public class D133 {

    private static int calcularBase9(String num, int base) {
        int calculo = 0;
        for (int i = 0; i < num.length(); i++){
            char c = num.charAt(i);
            if (Character.isDigit(c)) calculo += c - '0';
            else calculo += (c + 10 - 'A');
            
            if (calculo >= base) calculo -= base;
        }
        return calculo;
    }

    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);     
        int casos = Integer.parseInt(sc.next());

        while (casos-- != 0) {
            int base = Integer.parseInt(sc.next()) - 1;
            String resultado = sc.next();
            String divisor = sc.next();
            String cociente = sc.next();
            String resto = sc.next();

            boolean correcto = calcularBase9(resultado, base) == (calcularBase9(divisor, base) * calcularBase9(cociente, base) + calcularBase9(resto, base)) % base;
            System.out.println(correcto ? "POSIBLEMENTE CORRECTO" : "INCORRECTO");
        }

        sc.close();
    }
}