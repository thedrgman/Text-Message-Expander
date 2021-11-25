// package textmsgexpander;
import java.util.Scanner;
public class TextMsgExpander {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;
        
        System.out.println("Enter text: ");
        userInput = scnr.nextLine();
        System.out.println("You entered: " + userInput);
        
        System.out.println();
        
        if (userInput.contains("BFF") == true){
            System.out.println("Replaced \"BFF\" with \"best friend forever\".");
        }
        
        if (userInput.contains("IDK") == true){
            System.out.println("Replaced \"IDK\" with \"I don't know\".");
        }
        
        if (userInput.contains("JK") == true){
            System.out.println("Replaced \"JK\" with \"just kidding\".");
        }
        
        if (userInput.contains("TMI") == true){
            System.out.println("Replaced \"TMI\" with \"best friend forever\".");
        }
        
        if (userInput.contains("TTYL") == true){
            System.out.println("Replaced \"TTYL\" with \"talk to you later\".");
        }
        
        
        userInput = userInput.replace("BFF","best friend forever");
        userInput = userInput.replace("IDK","I don't know");
        userInput = userInput.replace("JK","just kidding");
        userInput = userInput.replace("TMI","too much information");
        userInput = userInput.replace("TTYL","talk to you later");
        
        System.out.println();
       
        System.out.println("Expanded: " + userInput);
        
    }
    
}
