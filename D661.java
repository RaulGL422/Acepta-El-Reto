import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class D661 implements Comparable<D661> {
    
    private int peso;
    private int valor;
    private String nombre;

    public D661(int peso, int valor, String nombre) {
        this.peso = peso;
        this.valor = valor;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int compareTo(D661 o) {
        if (this.valor != o.valor) {
            return o.valor - this.valor;
        }

        if (this.peso != o.peso) {
            return this.peso - o.peso;
        }

        return 0;
    }

    private static int obtNum() throws IOException, NullPointerException, NumberFormatException {
        int input, num = 0;
        while((input = System.in.read()) != '\n' && input != ' ') num = num * 10 + (input - '0');
        return num;
    }

    private static String obtText() throws IOException, NullPointerException, NumberFormatException {
        int input;
        StringBuilder palabra = new StringBuilder();
        while((input = System.in.read()) != '\n' && input != ' ') palabra.append((char) input);
        return palabra.toString();
    }

    public static void main(String[] args) throws NumberFormatException, NullPointerException, IOException {
        int tesoros;
        StringBuilder result = new StringBuilder();
        while ((tesoros = obtNum()) != 0) {
            D661[] tumba = new D661[tesoros];
            for (int tesoro = 0; tesoro < tesoros; tesoro++) {
                String nombre = obtText();
                int valor = obtNum();
                int peso = obtNum();

                tumba[tesoro] = new D661(peso, valor, nombre);
            }
            
            Arrays.sort(tumba);
            
            for (int i = 0; i < tumba.length; i++) {
                result.append(tumba[i]).append(' ');
            }
            result.delete(result.length() - 1, result.length()).append('\n');
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
}
