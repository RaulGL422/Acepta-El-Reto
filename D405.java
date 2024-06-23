import java.io.IOException;

public class D405 {
    private static int obtNum() throws IOException {
        int c, num = 0;
        while ((c = System.in.read()) != ' ' && c != '\n') {
            num = num * 10 + (c - '0');
        }

        return num;
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        boolean colocaSigno;
        StringBuilder result = new StringBuilder();
        int num, numAnterior;

        while ((num = obtNum()) != 0) {
            colocaSigno = true;
            result.append(num);
            numAnterior = num;
            num = obtNum();
            while (num != 0) {
                if (numAnterior + 1 != num) {
                    if (!colocaSigno) {
                        result.append(numAnterior);
                        colocaSigno = true;
                    }
                    result.append(',').append(num);
                } else {
                    if (colocaSigno) {
                        result.append('-');
                        colocaSigno = false;
                    }
                }
                numAnterior = num;
                num = obtNum();
            }
            if (!colocaSigno) result.append(numAnterior);
            
            result.append('\n');
        }
        System.out.print(result);
    }
}
