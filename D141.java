import java.io.IOException;
import java.io.OutputStream;

public class D141 {
    public static void main(String[] args) throws IOException, NumberFormatException, NullPointerException {
        int c;
        StringBuilder result = new StringBuilder();
        OutputStream out = System.out;
        while (true) {
            int parentesis = 0, corchetes = 0, llaves = 0;
            while ((c = System.in.read()) != '\n' && c != -1) {
                switch ((char) c) {
                    case '(': parentesis++;break;
                    case ')': parentesis--;break;
                    case '[': corchetes++;break;
                    case ']': corchetes--;break;
                    case '{': llaves++;break;
                    case '}': llaves--;break;
                    default: break;
                }
            }
            result.append(llaves == 0 && parentesis == 0 && corchetes == 0 ? "YES\n" : "NO\n");
            if (c == -1) break;
        }
        
        out.write(result.toString().getBytes());
    }
}