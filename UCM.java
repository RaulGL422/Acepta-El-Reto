import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class UCM implements Comparable<UCM> {

    private int id;
    private int inter;
    private int interAcumulado;

    public UCM(int id, int inter) {
        this.id = id;
        this.inter = inter;
        this.interAcumulado = inter;
    }

    @Override
    public int compareTo(UCM o) {
        int compareInter = Integer.compare(this.interAcumulado, o.interAcumulado);
        if (compareInter == 0) return Integer.compare(this.id, o.id);
        return compareInter;
    }

    private void addInter() {
        this.interAcumulado += this.inter;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        Queue<UCM> pacientes = new PriorityQueue<>();
        
        while (true) {
            int cantidadUsuarios = Integer.parseInt(entrada.readLine());

            if (cantidadUsuarios == 0) break;
            
            for (int i = 0; i < cantidadUsuarios; i++) {
                String[] datos = entrada.readLine().split(" ");
                pacientes.add(new UCM(Integer.parseInt(datos[0]), Integer.parseInt(datos[1])));
            }

            int cantidadConsultas = Integer.parseInt(entrada.readLine());;

            for (int i = 0; i < cantidadConsultas; i++) {
                UCM paciente = pacientes.poll();
                System.out.println(paciente.id);
                paciente.addInter();
                pacientes.add(paciente);
            }

            pacientes.clear();
            System.out.println("----");
        }
    }
    
}