import java.util.Scanner;

public class D523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = Integer.parseInt(sc.next());
        String matricula;
        int modernos, antiguos;
        while (casos-- != 0) {
            modernos = antiguos = 0;
            String matriculaEdu = sc.next();
            String letrasMatriculaEdu = matriculaEdu.substring(4, 7);
            String numerosMatriculaEdu = matriculaEdu.substring(0, 4);

            while (true) {
                matricula = sc.next();
                if (matricula.equals("0")) break;

                String letrasMatricula = matricula.substring(4, 7);
                String numerosMatricula = matricula.substring(0,4);
                if (letrasMatricula.equals(letrasMatriculaEdu)) {
                    if (numerosMatricula.compareTo(numerosMatriculaEdu) > 0) modernos++; else antiguos++;
                } else {
                    if (letrasMatricula.compareTo(letrasMatriculaEdu) > 0) modernos++; else antiguos++;
                }
            }

            System.out.println(antiguos + " " + modernos);
        }
        sc.close();
    }
}
