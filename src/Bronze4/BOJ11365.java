package Bronze4;

import java.util.Scanner;

public class BOJ11365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            String text = sc.nextLine();
            if(text.equals("END")) break;
            char[] chars = text.toCharArray();
            for (int i = chars.length-1; i>=0; i--){
                System.out.print(chars[i]);
            }
            System.out.println();
        }
    }
}
