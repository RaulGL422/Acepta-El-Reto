import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> mapa = new HashMap<>();
        while (true) {
            int eventos = sc.nextInt();
            if (eventos == 0) break;
            sc.nextLine();
            while (eventos--!= 0) {
                String[] evento = sc.nextLine().split(" ");
                if (evento[0].equals("?")) {
                    int armas = 0;
                    for (int i = 2; i < evento.length; i++) {
                        armas += mapa.get(evento[i]);
                        mapa.put(evento[i], 0);
                    }
                    System.out.println(armas);
                } else {
                    if (mapa.containsKey(evento[0]))
                        mapa.put(evento[0], mapa.get(evento[0]) + Integer.parseInt(evento[1]));
                    else 
                        mapa.put(evento[0], Integer.parseInt(evento[1]));
                }
            }
            System.out.println("---");
            mapa.clear();
        }
    }
}
