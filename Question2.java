import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
      /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     //Create Scanner 
    Scanner in = new Scanner(System.in);
    
    //Prompt user for Height 
    //System.out.println("Enter your Height (in m): ");
    
    //Height input
    double height = in.nextDouble();
    
    //Prompt user for Weight
    //System.out.println("Enter your Weight (in kg): ");
    
    //Weight input 
    double weight = in.nextDouble();
    
    //Calculate and print out BMI
    double BMI = weight /(height * height); //calculate BMI
    //System.out.println("Your BMI:" + BMI); //print out BMI
    
  }
}
