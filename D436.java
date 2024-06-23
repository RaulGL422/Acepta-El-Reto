import java.io.IOException;
import java.util.Scanner;

public class D436 {

    private static int obtNum() throws IOException, NullPointerException, NumberFormatException {
        int input, num = 0;
        while ((input = System.in.read()) != '\n') num = num * 10 + (input - '0');
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextDouble()) {
            double micrasPapel = sc.nextDouble() ;
            double metrosEdificio = sc.nextDouble();
            int pliegues = 0;

            micrasPapel *= Math.pow(10, -6);

            while (metrosEdificio > micrasPapel) {
                pliegues++;
                micrasPapel *= 2;
            }
            System.out.println(pliegues);
        }
    }
}
