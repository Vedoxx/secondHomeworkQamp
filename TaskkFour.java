import java.util.Scanner;


public class TaskkFour {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);

        System.out.print("Enter the word:");
        String wordPalindrom = object.nextLine();
        String lowerWord=wordPalindrom.toLowerCase();
        boolean result = IsWordPalindrom(lowerWord);
        if (result) {
            System.out.println("Word is a palindrom");
        } else {
            System.out.println("Word is not a palindrom");
        }
    }
    static boolean IsWordPalindrom(String word)
    {
    int startString=0;
    int endString=word.length()-1;

    while(startString<endString)
    {
        if(word.charAt(startString)!=word.charAt(endString))
        {
            return false;
        }
        startString++;
        endString--;
    }
        return true;
    }
}
