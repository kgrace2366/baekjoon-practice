package Bronze4.day5;

import java.util.Scanner;

public class BOJ3046 {
    public static void main(String[] args) {
        // S*2 = R1 + R2
        // R2 = S*2 - R1
        Scanner sc = new Scanner(System.in);
        int R1 = sc.nextInt();
        int S = sc.nextInt();
        System.out.println(S*2 - R1);
    }
}
