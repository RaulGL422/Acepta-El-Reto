import java.io.IOException;
import java.io.OutputStream;

public class D101 {

    private static boolean verificarDiabolico(int[] cuadrado, int cuadradoMagico, int tamanio) {
        int sumaActual = 0;
        int[] filas = new int[tamanio];
        for (int i = 0; i < cuadrado.length; i++) {
            if (i % tamanio == 0) {
                if (sumaActual == cuadradoMagico) return false;
                sumaActual = 0;
            }
            filas[i % tamanio] += cuadrado[i];
        } 
        for (int fila : filas) {
            if (fila != cuadradoMagico) return false;
        }
        return true;
    }

    private static boolean verificarEsoterico(int[] cuadrado, int cuadradoMagico2, int tamanio) {

    }

    private static int obtNum() throws IOException, NullPointerException, NumberFormatException {
        int input, num = 0;
        while((input = System.in.read()) != '\n' && input != ' ') num = num * 10 + (input - '0');
        return num;
    }

    public static void main(String[] args) throws NumberFormatException, NullPointerException, IOException {
        int tamanio;
        StringBuilder result = new StringBuilder();
        while ((tamanio = obtNum()) != 0) {
            int[] cuadrado = new int[tamanio * tamanio];
            int cuadradoMagico = 0;

            for (int i = 0; i < tamanio; i++) {
                cuadrado[i] = obtNum();
                cuadradoMagico = cuadrado[i];
            }

            for (int i = tamanio; i < cuadrado.length; i++) {
                cuadrado[i] = obtNum();
            }

            boolean diabolico = verificarDiabolico(cuadrado, cuadradoMagico, tamanio);
            int cuadradoMagico2 = 4 * cuadradoMagico / tamanio;
            boolean esoterico = verificarEsoterico(cuadrado, cuadradoMagico2, tamanio);
        }

        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
}