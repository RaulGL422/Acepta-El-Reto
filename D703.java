import java.io.IOException;

public class D703 {

    private static int obtNum() throws IOException {
        int input, num = 0;
        while ((input = System.in.read()) != '\n' && input != ' ' && input != ':') num = num * 10 + (input - '0');
        return num;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int casos = obtNum();
        StringBuilder result = new StringBuilder();
        while (casos-- != 0) {
            int horas = obtNum();
            int minutos = obtNum() + horas * 60;
            obtNum();
            int recorrido = minutos * obtNum() / 60;
            result.append(recorrido).append('\n');
        }
        System.out.print(result);
    }
}
