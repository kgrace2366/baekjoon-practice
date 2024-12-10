package Bronze4.day10;

import java.util.Scanner;

public class BOJ1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String text = sc.nextLine();
            if(text.equals("#"))break;
            char[] textArr = text.toCharArray();
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (textArr[i] == 'a' || textArr[i] == 'e' || textArr[i] == 'i' || textArr[i] == 'o' || textArr[i] == 'u' ||
                        textArr[i] == 'A' || textArr[i] == 'E' || textArr[i] == 'I' || textArr[i] == 'O' || textArr[i] == 'U') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
