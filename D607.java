import java.io.IOException;
import java.io.OutputStream;

public class D607 {
    private static int obtNum() throws IOException {
        int num = 0;
        int input;
        while ((input = System.in.read()) != '\n' && input != ' ' && input != -1) {
            num = num * 10 + (input - '0');
        }
        return num;
    }

    public static void main(String[] args) throws IOException {
        OutputStream out = System.out;
        StringBuilder result = new StringBuilder();
        
        int casos = obtNum();
        while (casos-- > 0) {
            int copiasNecesarias = obtNum();
            int copias = 1;
            int vecesCopiado = 0;
            
            while (copias < copiasNecesarias) {
                copias <<= 1;
                vecesCopiado++;
            }
            result.append(vecesCopiado).append('\n');
        }
        
        out.write(result.toString().getBytes());
    }
}