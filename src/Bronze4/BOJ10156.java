package Bronze4.day9;

import java.util.Scanner;

public class BOJ10156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();
        int temp = K*N - M;
        if (temp < 0) {
            System.out.println("0");
        } else System.out.println(temp);
    }
}
