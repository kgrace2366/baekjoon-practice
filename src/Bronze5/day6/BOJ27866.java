package day6;

import java.util.Scanner;

public class BOJ27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int index = sc.nextInt();
        System.out.println(text.charAt(index-1));
    }
}
