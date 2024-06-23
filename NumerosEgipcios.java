import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NumerosEgipcios {
    public static void main(String[] args) {
        Map<Character, Integer> mapa = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);

        mapa.put('H', 1000000);
        mapa.put('R', 100000);
        mapa.put('D', 10000);
        mapa.put('F', 1000);
        mapa.put('C', 100);
        mapa.put('G', 10);
        mapa.put('T', 1);

        while (true) {
            int numeroRestante = sc.nextInt();

            if (numeroRestante == 0) 
                break;

            Iterator<Character> it = mapa.keySet().iterator();
            String numeroEgipcio = "";
            while (it.hasNext()) {
                char digitoEgipcio = it.next();
                int valorEgipcio = mapa.get(digitoEgipcio);

                while (numeroRestante >= valorEgipcio) {
                    numeroRestante -= valorEgipcio;
                    numeroEgipcio += digitoEgipcio;
                }
            }

            System.out.println(numeroEgipcio);
        }

    }
}
