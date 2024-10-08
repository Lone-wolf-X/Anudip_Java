import java.util.Scanner;

class CheckCharacter{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char ch = x.next().charAt(0);

        System.out.println("You entered Character is "+ch);
        
       String result = Character.isLetter(ch) 
       ? (Character.isLowerCase(ch) ? ch + " is a lowercase letter." : ch + " is an uppercase letter.") 
       : ch + " is not a letter.";

       System.out.println(result);
    

    }
    
};