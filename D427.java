import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D427 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int casos = Integer.parseInt(entrada.readLine());
        while (casos-- != 0) {
            boolean secreto = false;
            String personaje = entrada.readLine();
            String parentesco = entrada.readLine();

            if (personaje.equals("Luke") && parentesco.equals("padre")) secreto = true;

            System.out.println(secreto ? "TOP SECRET" : personaje + ", yo soy tu " + parentesco);
        }
    }
}
