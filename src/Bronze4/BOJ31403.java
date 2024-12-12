package Bronze4;

import java.util.Scanner;

public class BOJ31403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        String AB = String.valueOf(A) + String.valueOf(B);
        System.out.println(A+B-C);
        System.out.println(Integer.parseInt(AB)-C);
    }
}
