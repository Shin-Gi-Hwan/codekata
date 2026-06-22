import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = a + b;
        double avg = result / 2.0;

        System.out.printf("%d %.1f", result, avg);
    }
}