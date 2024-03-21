import java.util.Scanner;

public class JPA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.printf("%d is larger than %d\n", a, b);
        } else {
            System.out.printf("%d is larger than %d\n", b, a);
        }
        
        System.out.println("Input:");
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (c > d) {
            System.out.printf("%d is larger than %d\n", c, d);
        } else {
            System.out.printf("%d is larger than %d\n", d, c);
        }
        
        scanner.close();
    }
}
