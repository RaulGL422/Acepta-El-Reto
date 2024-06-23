import java.io.IOException;
import java.io.OutputStream;

public class D482 {

    public static void main(String[] args) throws IOException {

        byte[] buffer = new byte[1024];
        int bytesRead;
        OutputStream out = System.out;
        boolean negro = false, gris = false;
        
        while ((bytesRead = System.in.read(buffer) - 1) != -1) {
            int indice = 0;
            char c = ' ';
            while (indice < bytesRead) {
                c = (char) buffer[indice++];
                if (c == '.') break;
                if (c == 'N') {
                    negro = !negro;
                } else if (c == 'G') {
                    gris = !gris;
                }
            }
            if (c == '.' && indice == 1) break;
            out.write((!negro && !gris ? "EMPAREJADOS\n" : negro && gris ? "PAREJA MIXTA\n" : negro && !gris ? "NEGRO SOLITARIO\n" : "GRIS SOLITARIO\n").getBytes());
            negro = false;
            gris = false;
        }
    }
}