import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class Encrucijada {
    
    private static Long next() throws IOException {
        int input;
        long num = 0;
        while((input = System.in.read()) != ' ' && input != '\n')
            num = num * 10 + (input - '0');
        
        return num;
    }

    private static Map<Integer, Integer> mapaValores = prepareMap();

    private static Map<Integer, Integer> prepareMap() {
        Map<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < 10; i++) mapa.put(i, i);

        int elevadeishon = (int) Math.pow(10, 5);
        for (int i = 10; i < elevadeishon; i++) {
            int[] numeroPartido = partirNumero(i);
            mapa.put(i, mapa.get(numeroPartido[0]) + mapa.get(numeroPartido[1]));
        }
        return mapa;
    }

    private static int[] partirNumero(long numero) {
        int cifras = (int) Math.log10(numero) + 1;
        int otro = (int) Math.ceil(cifras / 2);
        int sMitad = (int) (numero / Math.pow(10, otro));
        int pMitad = (int) (numero % Math.pow(10, otro));

        int[] numeroPartido = {pMitad, sMitad};
        return numeroPartido;
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        long intBajo, intAlto;
        StringBuilder result = new StringBuilder();
        while ((intBajo = next()) != 0 && (intAlto = next()) != 0) {
            long precio = 0;

            intBajo += (3 - intBajo % 3) % 3; // Prepara el primer numero multiplo de 3

            while (intBajo <= intAlto) {
                int[] numeroPartido = partirNumero(intBajo);
                precio += mapaValores.get(numeroPartido[0]) + mapaValores.get(numeroPartido[1]);
                intBajo += 3;
            }
            result.append(precio).append('\n');
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }


}