import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

class Serie implements Comparable<Serie> {
    private int minutos;
    private String nombre;
    public Serie(int minutos, String nombre) {
        this.minutos = minutos;
        this.nombre = nombre;
    }
    public int getMinutos() {
        return minutos;
    }
    public String getNombre() {
        return nombre;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Serie other = (Serie) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }
    @Override
    public int compareTo(Serie o) {
        if (Integer.compare(minutos, o.minutos) == 0) {
            return nombre.compareTo(o.nombre);
        }
        return Integer.compare(o.minutos, minutos);
    }

    public void addMinutos(int cant) {
        minutos += cant;
    }
}

public class D700 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Serie> lista = new ArrayList<>();
        while (true) {
            int sesiones = sc.nextInt();
            if (sesiones == 0) break;

            for (int i = 0; i < sesiones; i++) {
                int min = sc.nextInt();
                String nombre = sc.nextLine();
                Serie serie = new Serie(min, nombre.trim());
                if (lista.indexOf(serie) != -1) {
                    lista.get(lista.indexOf(serie)).addMinutos(min);
                } else {
                    lista.add(serie);
                }
            }            
            Collections.sort(lista);
            for (Serie serie : lista) {
                if (serie.getMinutos() >= 30) {
                    System.out.println(serie.getNombre());
                }
            }
            System.out.println("---");
            lista.clear();
        }
    }
}
