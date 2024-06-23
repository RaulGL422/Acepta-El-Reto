import java.io.IOException;

public class D529 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        int casos = 0, input;
        while ((input = System.in.read()) != '\n') casos = casos * 10 + (input - '0');
        StringBuilder result = new StringBuilder();
        while (casos-- != 0) {
            char c;
            int contador = 0;
            int maximoUsuarios = 0;
            while ((input = System.in.read()) != '\n') {
                c = (char) input;
                if (contador == 0 && c == 'O') maximoUsuarios++;
                else if (c == 'I') contador++;
                else contador--;
                if (contador > maximoUsuarios) maximoUsuarios = contador;
            };
            result.append(maximoUsuarios).append('\n');
        }
        System.out.print(result);
    }
}
