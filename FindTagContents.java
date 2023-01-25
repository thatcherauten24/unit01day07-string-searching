import java.util.Scanner;

public class FindTagContents {
    public static void main(String[] args) {
        
        System.out.println("please type in the html you want to seach within");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        System.out.println("Thanks, now enter the search term");
        String searchTerm = scanner.nextLine();

        int textPos = text.indexOf(searchTerm);
        int closingTagStartPos = text.indexOf("</", textPos);
        int closingTagEndPos = text.indexOf(">", closingTagStartPos);

        System.out.print("The text you entered was within a blank tag");
        System.out.println(text.substring(closingTagStartPos + 2, closingTagEndPos));
        scanner.close();
    }
}