import java.io.IOException;

public class D716 {

    private static int obtNum() throws IOException {
        int read, num = 0;
        while ((read = System.in.read()) != ' ' && read != '\n') 
            num = num * 10 + (read - '0');

        return num;
    }
    public static void main(String[] args) throws IOException {
        int regletas;
        StringBuilder result = new StringBuilder();
        while ((regletas = obtNum()) != 0) {
            int restable = regletas;
            int suma = 0;
            while (regletas-- != 0) {
                suma += obtNum();
            }
            result.append(suma - (restable - 1)).append('\n');
        }
        System.out.print(result);
    }
}
