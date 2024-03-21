import java.util.Scanner;
public class JPA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input:");
        int a = s.nextInt();
        if (a%5==0 && a%9==0) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println("Input:");
        int b = s.nextInt();
        if (b%5==0 && b%9==0) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
