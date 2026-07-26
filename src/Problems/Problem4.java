package Problems;

import java.util.Locale;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Type a Sentence :");
        String input = s.nextLine();
        System.out.println("Total Words: " + word_count(input));
    }

    static int word_count(String sentence) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count = count + 1;
            }
        }
        return count + 1;
    }

    static int vowel_count(String sentence) {
        int vowel_count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a'
                    || sentence.charAt(i) == 'e'
                    || sentence.charAt(i) == 'i'
                    || sentence.charAt(i) == 'o'
                    || sentence.charAt(i) == 'u'
                    || sentence.charAt(i) == 'A'
                    || sentence.charAt(i) == 'E'
                    || sentence.charAt(i) == 'I'
                    || sentence.charAt(i) == 'O'
                    || sentence.charAt(i) == 'U'
            ) ;
        }
    }


}

