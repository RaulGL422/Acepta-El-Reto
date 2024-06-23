import java.io.IOException;
// NOT ACCEPTED
public class D245 {

    private static long obtNum() throws IOException, NullPointerException, NumberFormatException {
        long num = 0;
        int c;
        while ((c = System.in.read()) != ' ' && c != '\n') {
            num = num * 10 + (c - '0');
        }
        return num;
    }

    public static void main(String[] args) throws IOException, NullPointerException, NumberFormatException {
        long daltons;
        StringBuilder result = new StringBuilder();
        while ((daltons = obtNum()) != 0) 
            result.append(esDalton(daltons) ? "DALTON\n" : "DESCONOCIDOS\n");
        System.out.print(result);
    }

    private static boolean esDalton(long daltons) throws NumberFormatException, NullPointerException, IOException {
        boolean dalton = true;
        long anterior = obtNum();
        daltons--;
        while (daltons-- != 0) {
            long actual = obtNum();
            if (anterior >= actual) dalton = false;
            anterior = actual;
        }
        return dalton;
    }
}
