import java.io.IOException;

public class D682 {

    private static int obtNum() throws IOException {
        int read, num = 0;
        while ((read = System.in.read()) != ' ' && read != '\n') 
            num = num * 10 + (read - '0');

        return num;
    }

    public static void main(String[] args) throws IOException {
        StringBuilder result = new StringBuilder();
        int casos = obtNum();
        while (casos-- != 0) {
            int patos = obtNum();
            result.append(patos).append(' ').append(patos * 2).append('\n');
        }
        System.out.print(result);
    }
}
