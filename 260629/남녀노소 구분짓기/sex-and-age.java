import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int sex = sc.nextInt();
        int age = sc.nextInt();

        if (age >= 19) {
            if (sex == 0) {
                System.out.println("MAN");
            } else if (sex == 1) {
                System.out.println("WOMAN");
            } else {
                System.out.println("잘못된 입력 입니다.");
            }
        } else {
            if (sex == 0) {
                System.out.println("BOY");
            } else if (sex == 1) {
                System.out.println("GIRL");
            } else {
                System.out.println("잘못된 입력 입니다.");
            }
        }
    }
}