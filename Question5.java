import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
     //Create a Scanner
     Scanner in = new Scanner(System.in);
    
     //Prompt the user for input 
     System.out.println("Enter a number:");

     //Read,Save the input
     int number = in.nextInt();
    
     //Create an Array List
     ArrayList<Integer> numberlist = new ArrayList<>();

     //for loop to loop through the numbers
     for(int x=0; x<number; x++ ){
        //Prompt the user for input 
        System.out.println("Enter a number:");
      
        //Read,Save the input
        int number2 = in.nextInt();

        //Add number into array
        numberlist.add(number2);
     }
    
    
   
     //Access and find the mode


     //Print the mode
     System.out.println("The mode is: " + mode);


    
  }
}
