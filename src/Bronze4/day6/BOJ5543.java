package Bronze4.day6;

import java.util.Scanner;

public class BOJ5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int min_b = Math.min(A, Math.min(B, C));

        int D = sc.nextInt();
        int E = sc.nextInt();
        int min_d = Math.min(D, E);

        System.out.println(min_b + min_d - 50);
    }
}
