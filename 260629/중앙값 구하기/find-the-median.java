import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int mid = 0;

        if ((A > B && A < C) || (A > C && A < B)) {
            mid = A;
        } else if ((B > A && B < C) || (B > C && B < A)) {
            mid = B;
        } else {
            mid = C;
        }

        System.out.println(mid);
    }
}