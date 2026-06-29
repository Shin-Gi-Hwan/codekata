import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int mathUser1 = sc.nextInt();
        int engUser1 = sc.nextInt();

        int mathUser2 = sc.nextInt();
        int engUser2 = sc.nextInt();

        if (mathUser1 > mathUser2 && engUser1 > engUser2) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}