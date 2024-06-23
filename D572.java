import java.io.IOException;
import java.io.OutputStream;

public class D572 {

    private static double obtNum() throws IOException, NullPointerException, NumberFormatException {
        int input;
        StringBuilder num = new StringBuilder();
        while((input = System.in.read()) != '\n' && input != ' ') num.append((char) input);
        return Double.parseDouble(num.toString());
    }
    
    public static void main(String[] args) throws NumberFormatException, NullPointerException, IOException {
        int casos = (int) obtNum();
        StringBuilder result = new StringBuilder();
        while (casos-- != 0) {
            boolean media = true;
            boolean nueve = false;
            for (int i = 0; i < 5; i++) {
                double nota = obtNum();
                if (nota == 0.0) media = false;
                else if (nota >= 9.0) nueve = true;
            }
            result.append(nueve || media ? "MEDIA\n" : "SUSPENSO DIRECTO\n");
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
}
