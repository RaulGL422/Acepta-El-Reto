import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D603 {

    private static int obtNum() throws IOException, NullPointerException, NumberFormatException {
        int input, num = 0;
        while((input = System.in.read()) != '\n' && input != ' ') num = num * 10 + (input - '0');
        return num;
    }

    private static List<Integer> listaCortes;

    private static int cortarMadera(int[] madera) {
        List<Integer> cortesMadera = new ArrayList<>();
        for (int i = 0; i < madera.length; i++) {
            if (listaCortes.contains(madera[i])) cortesMadera.add(madera[i]);
        }
        int mitad = -1;
        if (!cortesMadera.isEmpty()) {
            mitad = Arrays.binarySearch(madera, cortesMadera.get(cortesMadera.size() / 2)) ;
            listaCortes.remove(cortesMadera.size() / 2);
        }

        return mitad == -1 ? 0 : 2 * madera.length + (cortarMadera(Arrays.copyOfRange(madera, 0, mitad)) + cortarMadera(Arrays.copyOfRange(madera, mitad, madera.length)));  
    }

    public static void main(String[] args) throws NumberFormatException, NullPointerException, IOException {
        int tablon;
        int cortes;
        listaCortes = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        while ((tablon = obtNum()) != 0 && (cortes = obtNum()) != 0) {
            for (int i = 0; i < cortes; i++) 
                listaCortes.add(obtNum());
            int[] metrosTablon = new int[tablon];
            for (int i = 0; i < metrosTablon.length; i++) 
                metrosTablon[i] = i + 1;
            int esfuerzoTotal = cortarMadera(metrosTablon);
            result.append(esfuerzoTotal).append('\n');
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
}
