import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FaseGrupos implements Comparable<FaseGrupos> {

    private int id;
    private int puntos;
    private int golesF;
    private int golesC;

    public FaseGrupos(int id) {
        this.id = id + 1;
        this.puntos = 0;
        this.golesF = 0;
        this.golesC = 0;
    }

    private int diferenciaGoles() {
        return golesF - golesC;
    }

    @Override
    public int compareTo(FaseGrupos o) {
        int puntos = o.puntos - this.puntos;
        if (puntos == 0) {
            int diferencia = o.diferenciaGoles() - this.diferenciaGoles();
            if (diferencia == 0)
                return o.golesF - this.golesF;
            return diferencia;
        }
        return puntos;
        
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        
        result = prime * result + puntos;
        result = prime * result + diferenciaGoles();
        result = prime * result + golesF;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        final FaseGrupos other = (FaseGrupos)obj;
        if (this.puntos != other.puntos) return false;
        if (this.diferenciaGoles() != other.diferenciaGoles()) return false;
        if (this.golesF != other.golesF) return false;
        return true;
    }

    public static void main(String[] args) throws IOException {
        FaseGrupos[] faseGrupos;
        Set<FaseGrupos> clasificados;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int equipos = Integer.parseInt(sc.next());
            int cantidadClasificados = Integer.parseInt(sc.next());
            
            faseGrupos = new FaseGrupos[equipos];

            for (int i = 0; i < equipos; i++) faseGrupos[i] = new FaseGrupos(i);
            
            int partidosTotales = equipos * (equipos - 1) / 2;
            FaseGrupos equipoLocal, equipoVisitante;
            int golesLocal, golesVisitante;

            for (int partidosJugados = 0; partidosJugados < partidosTotales; partidosJugados++) { 
                equipoLocal = faseGrupos[Integer.parseInt(sc.next()) - 1];
                equipoVisitante = faseGrupos[Integer.parseInt(sc.next()) - 1];
                golesLocal = Integer.parseInt(sc.next());
                golesVisitante = Integer.parseInt(sc.next());

                equipoLocal.golesF += golesLocal;
                equipoLocal.golesC += golesVisitante;
                equipoVisitante.golesC += golesLocal;
                equipoVisitante.golesF += golesLocal;

                if (golesLocal > golesVisitante)
                    equipoLocal.puntos += 3;
                else if (golesVisitante < golesLocal) 
                    equipoVisitante.puntos += 3;
                else {
                    equipoVisitante.puntos += 1;
                    equipoLocal.puntos += 1;
                }
            }
            
            boolean empate = false;
            
            Arrays.sort(faseGrupos);
            
            String salida = "";
            clasificados = new LinkedHashSet<>(Arrays.asList(Arrays.copyOfRange(faseGrupos, 0, cantidadClasificados + 1)));
            if (clasificados.size() != cantidadClasificados + 1) empate = true;
            else {
                for (FaseGrupos equipo : faseGrupos) {
                    salida += equipo.id + " ";
                    if (--cantidadClasificados == 0) break;
                }
            }
            System.out.println(empate ? "EMPATE" : salida.substring(0, salida.length() - 1));
        }
        
    }
}