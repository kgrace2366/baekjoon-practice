package Bronze4;

import java.util.Scanner;

public class BOJ25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int temp_ammount = sc.nextInt();
            int temp_num = sc.nextInt();
            sum += temp_ammount * temp_num;
        }
        if (sum == total) System.out.println("YES");
        else System.out.println("NO");
    }
}