import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class D271 {
    public static void main(String[] args) throws IOException, InterruptedException {
        StringBuilder result = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int primerPajaro = Integer.parseInt(st.nextToken());
            int parejasPajaros = Integer.parseInt(st.nextToken());
            if (primerPajaro == 0 && parejasPajaros == 0) {
                break;
            }
            PriorityQueue<Integer> pajaros = new PriorityQueue<>();
            pajaros.add(primerPajaro);
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < parejasPajaros; i++) {
                pajaros.add(Integer.parseInt(st.nextToken()));
                pajaros.add(Integer.parseInt(st.nextToken()));
                Integer[] sortedArray = pajaros.toArray(new Integer[0]);
                result.append(sortedArray[(sortedArray.length - 1)/ 2]).append(' ');
            }
            result.replace(result.length() - 1, result.length(), "\n");
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
}