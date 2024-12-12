package Bronze4;

import java.util.Scanner;

public class BOJ10987 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char[] wordArray = word.toCharArray();
        int count = 0;
        for(int i = 0; i < wordArray.length; i++){
            if(wordArray[i] == 'a' || wordArray[i] == 'e' || wordArray[i] == 'i'
                    || wordArray[i] == 'o' || wordArray[i] == 'u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
