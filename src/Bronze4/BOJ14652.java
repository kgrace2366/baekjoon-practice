package Bronze4;

import java.util.Scanner;

public class BOJ14652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(K/M + " " + K%M);
    }
}
