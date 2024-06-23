import java.io.IOException;

public class D365 {

    private static int obtNum() throws IOException {
        int input, num = 0;
        while ((input = System.in.read()) != ' ' && input != '\n') num = num * 10 + (input - '0');
        return num;
    }
    
    public static void main(String[] args) throws IOException {
        int casos = obtNum();
        StringBuilder result = new StringBuilder();

        while (casos-- != 0) {
            int minutos = 0;
            int chicos = obtNum();
            int posicionAitor = obtNum();
            int[] lista = new int[chicos];

            while (chicos-- != 0) lista[lista.length  - 1 - chicos] = obtNum();

            int regalosAitor = lista[posicionAitor - 1];

            for (int i = 0; i <= posicionAitor - 1; i++) {
                minutos += lista[i] > regalosAitor ? regalosAitor * 2 : lista[i] * 2;
            }

            for (int i = posicionAitor; i < lista.length; i++) {
                minutos += lista[i] > regalosAitor - 1 ? (regalosAitor - 1) * 2 : lista[i] * 2;
            }

            result.append(minutos).append('\n');
        }
        System.out.print(result);
    }
}
