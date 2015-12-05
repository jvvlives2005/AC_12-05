package nyc.c4q.jvvlives2005;
import java.util.Scanner;

/**
 * Created by Joshelyn on 12/5/15.
Problem #1: The Pythagorean theorem for the relationship of the lengths of the three sides of a right triangle:
 a2 + b2 = c2 which can alternatively be written as: c =a2+b2

 Write a program that accepts values for a and b as doubles (you can assume that a and b will be positive) and then
 calculates the solution of c as a double. Your program should be able to duplicate the following sample run:


 */
public class PythagoreanTheorem
{

  public static void main (String[] args){

   Scanner input = new Scanner(System.in);

   System.out.println("Enter values to compute the Pythagorean theorem");
   System.out.print("A: " );
   double adjacent = input.nextDouble();
   System.out.print("B: ");
   double opposite = input.nextDouble() ;
   System.out.println("Hypotenuse: " + pythagorean(opposite, adjacent));
   //   System.out.println(pythagorean(getDoubleInput(2.5),getDoubleInput(4.5)));
  }

  public static double pythagorean(double opposite, double adjacent){
   double hypothenuse = Math.sqrt(Math.pow(opposite, 2)+ Math.pow(adjacent, 2));
   return hypothenuse;
  }


}
