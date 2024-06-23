import java.io.IOException;

public class D520 {

    private static int next() throws IOException, NullPointerException, NumberFormatException {
        int input, num = 0;
        while((input = System.in.read()) != '\n' && input != ' ') num = num * 10 + (input - '0');
        return num;
    }

    public static void main(String[] args) throws IOException, NullPointerException, NumberFormatException{
        int cubiletes, bolita;
        StringBuilder result = new StringBuilder();
        while (true) {
            cubiletes = next();
            bolita = next();
            if (cubiletes == 0 && bolita == 0) break;
            int cub1, cub2;
            while (true) {
                cub1 = next();
                cub2 = next();
                if (cub2 == 0 && cub1 == 0) break;
                if (cub1 == bolita) bolita = cub2;
                else if (cub2 == bolita) bolita = cub1;
            }
            result.append(bolita).append('\n');
        }
        System.out.print(result);
    }
}
