import java.util.Scanner;
public class JPA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int a = s.nextInt();
        if (a%6==0) {
            System.out.printf("%d 是 2、3、6的倍數\n",a);
        }else if (a%3==0) {
            System.out.printf("%d 是 3的倍數\n",a);
        }else if (a%2==0) {
            System.out.printf("%d 是 2的倍數\n",a);
        }else{
            System.out.printf("%d 不是 2、3、6的倍數\n",a);
        }
        System.out.println("Enter an integer:");
        int b = s.nextInt();
        if (b%6==0) {
            System.out.printf("%d 是 2、3、6的倍數\n",b);
        }else if (b%3==0) {
            System.out.printf("%d 是 3的倍數\n",b);
        }else if (b%2==0) {
            System.out.printf("%d 是 2的倍數\n",b);
        }else{
            System.out.printf("%d 不是 2、3、6的倍數\n",b);
        }
        System.out.println("Enter an integer:");
        int c = s.nextInt();
        if (c%6==0) {
            System.out.printf("%d 是 2、3、6的倍數\n",c);
        }else if (c%3==0) {
            System.out.printf("%d 是 3的倍數\n",c);
        }else if (c%2==0) {
            System.out.printf("%d 是 2的倍數\n",c);
        }else{
            System.out.printf("%d 不是 2、3、6的倍數\n",c);
        }
        System.out.println("Enter an integer:");
        int d = s.nextInt();
        if (d%6==0) {
            System.out.printf("%d 是 2、3、6的倍數",d);
        }else if (d%3==0) {
            System.out.printf("%d 是 3的倍數",d);
        }else if (d%2==0) {
            System.out.printf("%d 是 2的倍數",d);
        }else{
            System.out.printf("%d 不是 2、3、6的倍數",d);
        }
    }
}
