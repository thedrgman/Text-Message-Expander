import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
      Scanner  scnr = new Scanner(System.in);
      Scanner  inSS = null; 
      boolean  containComma = false;
      String   userInput;
      String   firstName = "";
      String   lastName = "";
      char     commaChar;
      
      System.out.println("Enter input String");
      userInput = scnr.nextLine();
      
      while (!containComma){
         if (userInput.contains(",")){
            containComma = true;
            inSS = new Scanner(userInput);
            firstName = inSS.next();
            commaChar = inSS.findInLine(",").charAt(0);
            lastName = inSS.next();
         }
         else{
            System.out.println("Error: No comma in string");
            System.out.println("Enter input String");
            userInput = scnr.nextLine();
         }
      }
      
      System.out.println(firstName);
      System.out.println(lastName);
      
   }
}