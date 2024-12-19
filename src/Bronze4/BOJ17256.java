package Bronze4;

import java.util.Scanner;

public class BOJ17256 {
    public static void main(String[] args) {
        /* a 🍰 b = (a.z + b.x, a.y × b.y, a.x + b.z)
        a, c를 토대로 a 🍰 b = c 를 만족하는 b를 구하는 문제
        => b = (c.x - a.z, c.y / a.y, c.z - a.x) */

        Scanner sc = new Scanner(System.in);
        int ax = sc.nextInt();
        int ay = sc.nextInt();
        int az = sc.nextInt();
        int cx = sc.nextInt();
        int cy = sc.nextInt();
        int cz = sc.nextInt();

        System.out.print(cx - az + " ");
        System.out.print(cy / ay + " ");
        System.out.print(cz - ax);
    }
}
