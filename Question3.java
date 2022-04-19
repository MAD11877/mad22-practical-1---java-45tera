import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
    //Creates Scanner
    Scanner in = new Scanner(System.in);
    
    //Prompt user for integer
    System.out.println("Enter a number: ");
    
    //Read,Store the input of the user
    int number = in.nextInt();
    
    //Multiply the number - as the number will be overriden (not really a good method)
    number = number * number ;
      
    //Print the number 
    System.out.println("The squared product of the number entered is " + number);
    
  }
}
