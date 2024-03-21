import java.util.Scanner;
public class JPA01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter score:");
        int a = s.nextInt();
        if (a>=60) {
            System.out.println("You pass");
            System.out.println("End");
        }else{
            System.out.println("End");
        }
        System.out.println("Please enter score:");
        int b = s.nextInt();
        if (b>=60) {
            System.out.println("You pass");
            System.out.println("End");
        }else{
            System.out.println("End");
        }



    }
}