import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] N = new int[9];
        for (int i = 0 ; i < N.length ; i++) {
            N[i] = scanner.nextInt();
        }

        int max = N[0];
        int index = 0;
        for (int i = 1; i < N.length ; i++) {
            if (N[i] > max) {
               max = N[i];
               index = i;
            }
        }

        System.out.printf("%d \n%d", max, index + 1);
    }
}