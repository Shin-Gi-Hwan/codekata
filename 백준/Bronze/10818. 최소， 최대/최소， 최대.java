import java.util.Scanner;

// BOJ 10818 | Bronze | 배열/구현 | min/max | 2026-02-23
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x < min) min = x;
            if (x > max) max = x;
        }

        System.out.println(min + " " + max);
    }
}