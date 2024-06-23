
import java.io.IOException;
import java.io.OutputStream;

public class D105 {
    private static String next() throws IOException, NullPointerException, NumberFormatException {
        StringBuilder palabra = new StringBuilder();
        int input;
        while((input = System.in.read()) != '\n') palabra.append((char) input);
        return palabra.toString();
    }

    private static double media(double[] numeros) {
        double suma = 0;
        for (double num : numeros) suma += num;
        return suma / numeros.length;
    }

    private static String dias(int indice) {
        String result = "";

        switch (indice) {
            case 0: result = "MARTES"; break;
            case 1: result = "MIERCOLES"; break;
            case 2: result = "JUEVES"; break;
            case 3: result = "VIERNES"; break;
            case 4: result = "SABADO"; break;
            case 5: result = "DOMINGO"; break;
            default: result = "EMPATE"; break;
        }

        return result;
    }

    private static int obtIndiceMax(double[] numeros) {
        int indice = 0;
        double maximo = numeros[0];
        boolean empate = false;
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                indice = i;
                maximo = numeros[i];
                empate = false;
            } else if (numeros[i] == maximo) {
                empate = true;
            }
        }
        return !empate ? indice : -1;
    }

    private static int obtIndiceMin(double[] numeros) {
        int indice = 0;
        double minimo = numeros[0];
        boolean empate = false;
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                indice = i;
                minimo = numeros[i];
                empate = false;
            } else if (numeros[i] == minimo) empate = true;
        }
        return !empate ? indice : -1;
    }


    public static void main(String[] args) throws NumberFormatException, NullPointerException, IOException {
        double primerDia;
        StringBuilder result = new StringBuilder();
        while ((primerDia = Double.parseDouble(next())) != -1) {
            double[] dias = new double[6];
            dias[0] = primerDia;
            for (int i = 1; i < dias.length; i++) dias[i] = Double.parseDouble(next());
            double domingo = dias[5];

            result.append(dias(obtIndiceMax(dias))).append(' ').append(dias(obtIndiceMin(dias))).append(' ').append(media(dias) < domingo ? "SI\n" : "NO\n");
        }
        OutputStream out = System.out;
        out.write(result.toString().getBytes());
    }
}
