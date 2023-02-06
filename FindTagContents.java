import java.util.Scanner;

public class FindTagContents {
    public static void main(String[] args) {
        
        System.out.println("please type in the html you want to seach within");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        System.out.println("Thanks, now enter the search term");
        String searchTerm = scanner.nextLine();

        int textPos = text.indexOf("<" + searchTerm + ">");
        int tagStartPos = text.indexOf(">", textPos);
        int tagEndPos = text.indexOf("</", tagStartPos);

        if (textPos == -1) {
            System.out.print("There are no '" + searchTerm + "' tags in the entered HTML");
        } else {
            System.out.println(text.substring(tagStartPos + 1, tagEndPos));
        }

        
        scanner.close();
    }
}