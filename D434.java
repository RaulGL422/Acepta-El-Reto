import java.io.IOException;

public class D434 {
    private static int obtNum() throws IOException {
        int input, num = 0;
        while ((input = System.in.read()) != '\n' && input != ' ') num = num * 10 + (input - '0');
        return num;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int casos = obtNum();
        StringBuilder result = new StringBuilder();
        while (casos-- != 0) {
            result.append(obtNum() > obtNum() ? "PRINCIPIO\n" : "ROMANCE\n");
        }
        System.out.print(result);
    }
}
