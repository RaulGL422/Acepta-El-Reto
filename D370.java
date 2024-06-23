import java.io.IOException;

public class D370 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int casos = 0, menor = 0, calibre1, calibre2, read;

        StringBuilder result = new StringBuilder();
        
        while ((read = System.in.read()) != '\n') 
            casos = casos * 10 + (read - '0');

        while (casos-- != 0) {
            int c = 0;
            while ((read = System.in.read()) != '\n') {
                if (read == '-') {
                    menor = c;
                    c = 0;
                } else c = c * 10 + (read - '0');
            }

            calibre1 = menor;
            calibre2 = c;
            boolean consecutivo = Math.abs(calibre1 - calibre2) == 1;

            menor = calibre1 < calibre2 ? calibre1 : calibre2;

            result.append(menor % 2 == 0 && consecutivo ? "SI" : "NO").append('\n');
        }
        System.out.print(result);
    }
}
