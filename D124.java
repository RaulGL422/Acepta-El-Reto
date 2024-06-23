import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D124 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int numero1, numero2, suma, llevada, carreo, index1, index2;
        
        while (true) {
            StringTokenizer st = new StringTokenizer(entrada.readLine());
            String num1 = st.nextToken();
            String num2 = st.nextToken();

            if (num1.equals("0") && num2.equals("0")) break;

            llevada = 0;
            carreo = 0;

            index1 = num1.length() - 1;
            index2 = num2.length() - 1;
            while (index1 >= 0 || index2 >= 0) {
                numero1 = index1 >= 0 ? num1.charAt(index1--) - '0' : 0;
                numero2 = index2 >= 0 ? num2.charAt(index2--) - '0' : 0;
                suma = numero1 + numero2 + llevada;
                
                if (suma >= 10) carreo++;
                
                llevada = suma / 10;
            }
            System.out.println(carreo);
        }
    }
}
