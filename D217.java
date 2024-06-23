import java.io.IOException;

public class D217 {
    public static void main(String[] args) throws IOException {
        int numero;
        while ((numero = obtenerNumero()) != 0) System.out.println(numero % 2 == 0 ? "DERECHA" : "IZQUIERDA");
    }

    private static int obtenerNumero() throws NumberFormatException, IOException {
        int input, numero = 0;
        while ((input = System.in.read()) != '\n' && input != '\r') 
            numero = numero * 10 + (input - '0');
        
        return numero;
    }
}
