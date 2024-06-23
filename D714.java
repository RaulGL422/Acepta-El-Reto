import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D714 {
    private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int equipos;
        while ((equipos = Integer.parseInt(next())) != 0) {
            
            String[] equiposRestantes = new String[equipos];
            for(int i = 0; i < equipos; i++) {
                equiposRestantes[i] = next();
            }
            
            String[] equiposClasificados;

            do {
                equiposClasificados = new String[equiposRestantes.length / 2];
                int golesLocal, golesVisitante, cantidadClasificados = 0;
    
                for (int i = 0; i < equiposRestantes.length; i += 2) {
                    golesLocal = Integer.parseInt(next());
                    golesVisitante = Integer.parseInt(next());
    
                    equiposClasificados[cantidadClasificados] = golesLocal > golesVisitante ? equiposRestantes[i] : equiposRestantes[i + 1];
                    cantidadClasificados++;
                }
                equiposRestantes = equiposClasificados;
            } while (equiposClasificados.length != 1);
            System.out.println(equiposRestantes[0]);
        }
    }
    
    private static String next() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(entrada.readLine());
        }
        return st.nextToken();
    }
}