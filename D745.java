import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> palabras = new ArrayList<>();
        do {
            palabras.clear();
            long numero;
            while ((numero = sc.nextLong()) != 0) {
                StringBuilder palabra = new StringBuilder();
                while (numero > 0) {
                    numero--;
                    char letter = (char) ('A' + (numero % 26));
                    palabra.insert(0, letter);
                    numero /= 26;
                }
                palabras.add(palabra.toString());
            }
            for (int i = 0; i < palabras.size(); i++) {
                System.out.print(palabras.get(i));
                if (i != palabras.size() - 1) {
                    System.out.print(' ');
                } else {
                    System.out.print('\n');
                }
            }
        } while (!palabras.isEmpty());
        sc.close();
    }
}
