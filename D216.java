import java.io.IOException;

public class D216 {

    private static int obtNum() throws IOException {
        int input, num = 0;
        while ((input = System.in.read()) != '\n') num = num * 10 + (input - '0');
        return num;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int casos = obtNum();
        StringBuilder result = new StringBuilder();
        while (casos-- != 0) {
            int gotas = obtNum();
            int horas = gotas / 3600;
            int minutos = (gotas % 3600) / 60;
            int segundos = gotas % 60;
            result.append(formatHora(horas)).append(':')
                  .append(formatHora(minutos)).append(':')
                  .append(formatHora(segundos)).append('\n');
        }
        System.out.print(result);
    }

    private static String formatHora(int valor) {
        return (valor < 10) ? "0" + valor : String.valueOf(valor);
    }
}
