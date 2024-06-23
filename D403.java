import java.util.Scanner;

public class D403 {
    private static int MIN = 4050;
    private static int MAX = 10800;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        while (casos-- != 0) {
            int metros = sc.nextInt();
            int campos = sc.nextInt();
            if (MIN * campos <= metros && MAX * campos >= metros ) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
