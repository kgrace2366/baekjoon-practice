package day1;

import java.util.Scanner;

public class BOJ1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextInt(); // 코테에서는 float보다 double 쓰는 게 더 좋음
        double B = sc.nextInt(); // double이 오차가 더 적기 때문
        System.out.println(A/B);
    }
}
