import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] arry = new String[10];
        for (int i = 0; i < arry.length; i++) {
            arry[i] = sc.next();
        }

        for (int j = 9; j >= 0; j--) {
            System.out.print(arry[j]);
        }
    }
}