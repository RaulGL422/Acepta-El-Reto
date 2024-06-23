import java.io.IOException;
import java.io.OutputStream;

/**
 * D294
 */
public class D294 {

    private static int obtNum() throws IOException {
        int input, num = 0;
        while ((input = System.in.read()) != '\n' && input != ' ') {
            if (input == -1) return -1;
            num = num * 10 + (input - '0');
        }
        return num;
    }

    private static int formas, minimoCuerdas, minimoPrecio;

    private static void antonio(int[] arrCordeles, int[] arrPrecio, int tamanioRestante, int cuerdasUsadas, int precioAcumulado, int cordel) {
        if (cordel != 0) {
            if (tamanioRestante == 0) {

            } else if (tamanioRestante < arrCordeles[cordel - 1]) {
                antonio(arrCordeles, arrPrecio, tamanioRestante, cuerdasUsadas, precioAcumulado, cordel - 1);
            } else {
                antonio(arrCordeles, arrPrecio, tamanioRestante, cuerdasUsadas, precioAcumulado, cordel - 1);
                antonio(arrCordeles, arrPrecio, tamanioRestante - arrCordeles[cordel - 1], cuerdasUsadas + 1, precioAcumulado + arrPrecio[cordel - 1], cordel - 1);
            }
        }
        if (tamanioRestante == 0) {
            minimoCuerdas = cuerdasUsadas < minimoCuerdas ? cuerdasUsadas : minimoCuerdas;
            minimoPrecio = precioAcumulado < minimoPrecio ? precioAcumulado : minimoPrecio;
            formas++;
        }
    }

    public static void main(String[] args) throws IOException {
        int cordeles, tamanioDeseado;
        StringBuilder result = new StringBuilder();
        while ((cordeles = obtNum()) != -1) {
            tamanioDeseado = obtNum();

            formas = 0;
            minimoCuerdas = 1000000;
            minimoPrecio = 1000000;

            int[] arrCordeles = new int[cordeles];
            int[] arrPrecio = new int[cordeles];
            long sumaCordeles = 0;
            for (int i = 0; i < arrCordeles.length; i++) {
                arrCordeles[i] = obtNum();
                arrPrecio[i] = obtNum();
                sumaCordeles += arrCordeles[i];
            }
            if (sumaCordeles < tamanioDeseado) {
                result.append("NO\n");
            } else {
                for (int i = cordeles - 1; i >= 0; i--) {
                    antonio(arrCordeles, arrPrecio, tamanioDeseado - arrCordeles[i], 1, arrPrecio[i], i);
                }
                result.append(formas == 0 ? "NO\n" : String.format("SI %d %d %d\n", formas, minimoCuerdas, minimoPrecio));
            }
        }

        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
}