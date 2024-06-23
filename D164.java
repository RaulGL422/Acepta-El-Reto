import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D164 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        while (true) {
            st = new StringTokenizer(entrada.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            if (x2 < x1 || y2 < y1) break;

            int x = x2 - x1;
            int y = y2 - y1;
            
            System.out.println(x * y);
        }
    }
}
