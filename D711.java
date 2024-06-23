import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D711 {

    private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    public static void main(String[] args) throws NumberFormatException, IOException {
        int casos, suma, mayor, menor;
        String codigo;

        casos = Integer.parseInt(next());
        for (int i = 0; i < casos; i++) {
            codigo = next();
            while (codigo.charAt(0) == '0') codigo = codigo.substring(1);
            
            suma = 0;
            for (int j = 0; j < codigo.length(); j++) {
                menor = 10;
                mayor = 0;
                int digito = codigo.charAt(j) - '0';
                if ((j + 1) % 2 == 0){
                    for (int h = 0; h < j; h++) {
                        if (j == 0) continue;
                        int digitoIzquierda = codigo.charAt(h) - '0';
                        if (digitoIzquierda > mayor) mayor = digitoIzquierda;
                    }
                    suma += (digito * 2) + mayor;
                } else {
                    for (int h = j + 1; h < codigo.length(); h++) {
                        int digitoDerecha = codigo.charAt(h) - '0';
                        if (digitoDerecha < menor) menor = digitoDerecha;
                    }
                    suma += (digito * 3) + menor;
                }
            }
            System.out.println(suma);
        }
    }

    private static String next() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(entrada.readLine());
        }
        return st.nextToken();
    }
}
