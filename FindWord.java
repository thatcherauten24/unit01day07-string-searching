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


        if (pos == -1) {
            System.out.println(letter + " is not in the sentence");
        } else {
            String textBeforeWord = text2.substring(0, pos);
            int wordStartPos = textBeforeWord.lastIndexOf(" ");
            int wordEndPos = text2.indexOf(" ", pos);
            System.out.println(text2.substring(wordStartPos + 1, wordEndPos));
        }
        
        scanner.close();
    }
}