import java.io.IOException;

public class D144 {
    public static void main(String[] args) throws IOException, NumberFormatException, NullPointerException {
        int input;
        StringBuilder linea = new StringBuilder();
        while (true) {
            int cursor = 1;
            while ((input = System.in.read()) != '\n' && input != -1) {
                char c = (char) input;
                switch (c) {
                    case '-': cursor = 0; break;
                    case '+': cursor = linea.length(); break;
                    case '*': cursor++; break;
                    case '3': if (cursor <= linea.length() - 1) linea.delete(cursor, cursor + 1); break;
                    default:
                        if (cursor > linea.length())
                            if (linea.length() != 0) cursor = linea.length();
                            else cursor = 0;
                        linea.insert(cursor++, c); break;
                }
            }
            linea.append('\n');
            if (input == -1) break;
        }
        System.out.write(linea.toString().getBytes());
    }
}
