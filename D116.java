import java.io.IOException;

public class D116 {
    void main() throws NumberFormatException, IOException {
        int repeticiones = (System.in.read() - '0');
        String texto = "Hola mundo.\n";
        while (repeticiones-- != 0) System.out.print(texto);
        
    }
}
