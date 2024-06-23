import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class D139 {
    private static StringBuilder salida;
    private static HashSet<Integer> numerosProcesados;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static int obtenerNumero(int num) {
        int suma = 0;
        int numero = num;
        
        while (numero != 0) {
            int digito = numero % 10;
            suma += digito * digito * digito;
            numero /= 10;
        }
        return suma;
    }

    private static int calcularCubifinito(int num) {
        int numero = obtenerNumero(num);
        salida.append(" " + numero + " -");

        if (numero == 1 || !numerosProcesados.add(numero)) 
            return numero;
        else
            return calcularCubifinito(numero);
    }

    private static int obtNum() throws IOException {
        int num = 0, read;
        while((read = br.read()) != '\n') 
            num = num * 10 + (read - '0');
        return num;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int numero;
        while ((numero = obtNum()) != 0) {
            numerosProcesados = new HashSet<>();
            numerosProcesados.add(numero);
            salida = new StringBuilder(numero + " -");
            int numeroFinal = numero == 1 ? numero : calcularCubifinito(numero);
            salida.append(numeroFinal == 1 ? "> cubifinito." : "> no cubifinito.");
            System.out.println(salida);
        }
    }
}