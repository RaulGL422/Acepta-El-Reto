import java.io.IOException;

public class D456 {

    private static int obtNum() throws IOException {
        int c, num = 0;
        while ((c = System.in.read()) != ' ' && c != '\n') {
            num = num * 10 + (c - '0');
        }

        return num;
    }

    public static void main(String[] args) throws IOException, NumberFormatException {
        int casos = obtNum();
        StringBuilder result = new StringBuilder();
        while (casos-- != 0) {
            int ancho = obtNum();
            int alto = obtNum();
            int totalTableta = ancho * alto;

            int total = obtNum();
            result.append(total % totalTableta == 0 ? total / totalTableta : total / totalTableta + 1).append('\n');
        }
        System.out.print(result);
    }
}
