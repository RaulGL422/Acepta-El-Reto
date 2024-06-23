import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class D143 {

    public static void main(String[] args) throws IOException {
        StringBuilder result = new StringBuilder();
        OutputStream out = System.out;
        Scanner sc = new Scanner(System.in);
        while (true) {
            int tortita;            
            List<Integer> listaTortitas = new ArrayList<>();
            while ((tortita = sc.nextInt()) != -1) {
                listaTortitas.add(tortita);
            }
            if (listaTortitas.size() == 0) break;
            Integer[] arrTortitas = new Integer[listaTortitas.size()];
            arrTortitas = listaTortitas.toArray(arrTortitas);

            int vueltas = sc.nextInt();
            Integer[] aux;
            for (int i = 0; i < vueltas; i++) {
                int cantidad = sc.nextInt();
                aux = Arrays.copyOfRange(arrTortitas, arrTortitas.length - cantidad, arrTortitas.length);
                int acum = aux.length - 1;
                for (int j = arrTortitas.length - cantidad; j < arrTortitas.length; j++) {
                    arrTortitas[j] = aux[acum];
                    acum--;
                }
            }
            result.append(arrTortitas[arrTortitas.length - 1]).append('\n');
            listaTortitas.clear();
        }
        sc.nextInt();
        out.write(result.toString().getBytes());
    }
}