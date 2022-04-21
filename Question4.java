import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
    
    //Create Scanner
    Scanner in = new Scanner(System.in);
    
    //Prompt user for integer
    //System.out.println("Enter a number:");
    
    //Read and Save the variable
    int rows = in.nextInt();
    
    //print the rows
    for (int x = rows -1;x >=0; x--){
      String line = "*";
      for (int y=0;y<x;y++){
        line += "*";
      } 
      System.out.println(line);
    }
  }
}
