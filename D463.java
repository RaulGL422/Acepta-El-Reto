import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
public class D463 {

    private static String obtCadena(InputStream in) throws IOException, NullPointerException, NumberFormatException {
        StringBuilder cadena = new StringBuilder();
        int input = in.read();
        if (input == -1) return "SALIR";
        else cadena.append((char) input);
        while ((input = in.read()) != '\n') {
            cadena.append( (char) input);
        } 
        return cadena.toString();
    }
    public static void main(String[] args) throws IOException, NullPointerException, NumberFormatException{
        String cadena;
        InputStream in = System.in;
        OutputStream out = System.out;
        while ((cadena = obtCadena(in)).hashCode() != "SALIR".hashCode()) {
            int altura = 1;
            int longitudCadena = cadena.length();
            char c;
            char lastC = ' ';
            for (int i = 0; i < longitudCadena; i++) {
                c = cadena.charAt(i);
                
                if (lastC == 'S' && c != 'B') altura++;
                else if (lastC == 'B' && c != 'S') altura--;

                lastC = c;
            }
            char[][] pantalla = new char[altura][longitudCadena];
            for (int i = 0; i < pantalla.length; i++) {
                Arrays.fill(pantalla[i], ' ');
            }
            int x = 0, y = altura - 1;
            lastC = ' ';
            for (int i = 0; i < longitudCadena; i++) {
                c = cadena.charAt(i);
                
                if (lastC == 'S' && c != 'B') y--;
                else if (lastC == 'B' && c != 'S') y++;

                pantalla[y][x] = (c == 'S' ? '/' : c == 'B' ? '\\' : '_');
                x++;
                lastC = c;
            }

            for (int i = 0; i < longitudCadena + 2; i++) out.write('#');
            out.write('\n');
            for (int i = 0; i < pantalla.length; i++) {
                out.write('#');
                for (int j = 0; j < longitudCadena; j++) 
                    out.write(pantalla[i][j]);
                out.write('#');
                out.write('\n');
            }
            for (int i = 0; i < longitudCadena + 2; i++) out.write('#');
            out.write('\n');
        }
    }
}
