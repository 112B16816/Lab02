import java.util.Scanner;
public class JPA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input:");
        int a = s.nextInt() , b = s.nextInt();
        if (a<b) {
            System.out.printf("%d is larger than %d" ,b,a);
        }else{
            System.out.printf("%d is larger than %d" ,a,b);
        }
        System.out.println("Input:");
        int c = s.nextInt() , d = s.nextInt();
        if (c>d) {
            System.out.printf("%d is larger than %d",c,d);
        }else{
            System.out.printf("%d is larger than %d",d,c);
        }
    }
}
