import java.util.Scanner;

public class JPA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Input Chinese score:");
            int a = s.nextInt();
            System.out.println("Input English score:");
            int b = s.nextInt();
            System.out.println("Input Math score:");
            int c = s.nextInt();
            
            if (a < 60) {
                System.out.println("Chinese failed");
            }
            if (b < 60) {
                System.out.println("English failed");
            }
            if (c < 60) {
                System.out.println("Math failed");
            }
            if (a >= 60 && b >= 60 && c >= 60) {
                System.out.println("All pass");
            }
        }
    }
}
