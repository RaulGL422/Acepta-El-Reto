import java.io.IOException;
import java.io.OutputStream;

public class D342 {

    private static int obtNum() throws IOException, NullPointerException, NumberFormatException {
        int input, num = 0;
        while((input = System.in.read()) != '\n' && input != ' ') num = num * 10 + (input - '0');
        return num;
    }
    
    public static void main(String[] args) throws NumberFormatException, NullPointerException, IOException {
        int li, ls, num;
        StringBuilder result = new StringBuilder();
        while ((li = obtNum()) != 0 && (ls = obtNum()) != 0 && (num = obtNum()) != 0) {
            int[] arrRespuestas = new int[obtNum()];
            for (int i = 0; i < arrRespuestas.length; i++) {
                int val = obtNum();
                if (val < li || val > ls) continue;
                if (val <= num) li = val;
                else if (num < val) ls = val - 1;
            }
            if (li == ls) result.append("LO SABE\n");
            else result.append("NO LO SABE\n");
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
}
