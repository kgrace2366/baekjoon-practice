package Bronze4;

import java.util.Scanner;

public class BOJ10797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            if(n == sc.nextInt())count++;
        }
        System.out.println(count);
    }
}
