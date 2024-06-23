import java.io.IOException;
import java.io.OutputStream;

public class D466 {
    private static String obtNum() throws IOException, NullPointerException, NumberFormatException {
        int input;
        StringBuilder numero = new StringBuilder();
        while((input = System.in.read()) != '\n' && input != ' ') numero.append((input - '0'));
        return numero.toString();
    }

    public static void main(String[] args) throws IOException, NullPointerException, NumberFormatException {
        int casos = Integer.parseInt(obtNum());
        StringBuilder result = new StringBuilder();
        while (casos-- != 0) {
            String num1 = obtNum();
            String num2 = obtNum();

            int diferencia = num1.length() - num2.length();
            boolean masGrande = diferencia > 0;
            if (diferencia < 0) diferencia *= -1;
            
            while (diferencia != 0) {
                if (masGrande) num2 = "0" + num2;
                else num1 = "0" + num1;
                diferencia--;
            }

            int llevada = 0;
            StringBuilder total = new StringBuilder();
            for (int i = num1.length() - 1; i >= 0; i--) {
                int c1 = num1.charAt(i) - '0';
                int c2 = num2.charAt(i) - '0';
                int calculo = c1 * c2 + llevada;
                total.insert(0, (calculo % 10));
                llevada = calculo / 10;
            }
            if (llevada != 0) total.insert(0, llevada);
            result.append(total).append('\n');
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
}
