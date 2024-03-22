import java.util.Scanner;
public class JPA {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            System.out.println("Input:");
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            if (a>=90) {
                System.out.println("Your grade is A");
            }else if (90 > a && a >= 80) {
                System.out.println("Your grade is B");
            }else if (80 > a && a >= 70) {
                System.out.println("Your grade is C");
            }else if (70 > a && a >= 60) {
                System.out.println("Your grade is D");
            }else{
                System.out.println("Your grade is F");
            }
        }
    }
}
