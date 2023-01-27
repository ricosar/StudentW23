import java.util.Scanner;
/**
 *hello there
 * @author Sarah
 added comment for PULL
 added comment for PULL command at 12:37pm
 */
public class ReverseWord {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        
        char[] myLetters = new char[word.length()];
        
        for(int i = 0; i < myLetters.length; i++){
            myLetters[i] = word.charAt(i);
            System.out.print(myLetters[i]);
        }//end of for
        
        System.out.println();
        System.out.print("Printing in reverse: ");
        
        for(int j = myLetters.length - 1; j >= 0; j--){
            System.out.print(myLetters[j]);
        }//end of reverse loop
        
    }//end of main
    
}//end of class
