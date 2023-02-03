// BUG: searching for "z" in "the quick brown fox jumped" caused the following error:
/* 
 * Exception in thread "main" java.lang.StringIndexOutOfBoundsException: begin 0, end -1, length 27
        at java.base/java.lang.String.checkBoundsBeginEnd(String.java:3319)
        at java.base/java.lang.String.substring(String.java:1874)
        at FindWord.main(FindWord.java:15)
 */
import java.util.Scanner;

public class FindWord {
    public static void main(String[] args) {
        
        System.out.println("Please enter a sentence or phrase");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String text2 = text + " ";

        System.out.println("Please enter a letter to search for within your sentence or phrase");
        String letter = scanner.nextLine();

        int pos = text2.indexOf(letter);
        String textBeforeWord = text2.substring(0, pos);
        int wordStartPos = textBeforeWord.lastIndexOf(" ");
        int wordEndPos = text2.indexOf(" ", pos);
        
        if (pos == -1) {
            System.out.println(letter + " is not in the sentence");
        } else {
            System.out.println(text2.substring(wordStartPos + 1, wordEndPos));
        }

        scanner.close();
    }
}
//commit