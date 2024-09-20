import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * InnerD477
 */
class Arma implements Comparable<Arma> {
    private int inocente;
    private int doctor;
    private int pos;
    public Arma(int inocente, int doctor, int pos) {
        this.inocente = inocente;
        this.doctor = doctor;
        this.pos = pos;
    }
    @Override
    public int compareTo(Arma o) {
        if (inocente - o.inocente == 0) {
            return o.doctor - doctor;
        }
        return inocente - o.inocente;
    }
    public int getDoctor() {
        return doctor;
    }
    public int getPos() {
        return pos;
    }

    
    
}
public class D477 {
    private static int obtNum() throws IOException, NumberFormatException, NullPointerException {
        int num = 0, input;
        while ((input = System.in.read()) != '\n' && input != ' ') {
            num = num * 10 + (input - '0');
        }
        return num;
    }
    public static void main(String[] args) throws NumberFormatException, NullPointerException, IOException {
        List<Integer> posiciones = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        while (true) {
            int salud = obtNum();
            if (salud == 0) break;

            int armas = obtNum();
            Arma[] arrArmas = new Arma[armas];
            for (int i = 0; i < arrArmas.length; i++) {
                arrArmas[i] = new Arma(obtNum(), obtNum(), i + 1);
            }

            Arrays.sort(arrArmas);
            int danioSumado = 0;
            
            for (int i = 0; i < arrArmas.length; i++) {
                danioSumado += arrArmas[i].getDoctor();
                posiciones.add(arrArmas[i].getPos());
                if (danioSumado >= salud) break;
            }

            if (danioSumado < salud) {
                result.append("MUERTE ESCAPA\n");
            } else {
                for (int i = 0; i < posiciones.size(); i++) {
                    result.append(posiciones.get(i));
                    if (posiciones.size() - 1 != i) {
                        result.append(' ');
                    } else {
                        result.append('\n');
                    }
                }
            }
            posiciones.clear();
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }

}
