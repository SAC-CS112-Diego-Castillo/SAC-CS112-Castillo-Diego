

import java.util.Scanner; //program uses class Scanner

public class Solution
{ 
  // main method begins execution of Java application
  public static void main(String[] args)
  {
    // create Scanner to obtain input from command window
   Scanner input = new Scanner(System.in);

   int number1; //first integer to add
   int number2; //second integer to add
   int sum; // sum of number1 and number2
   int product; //product of number 1 and number2
   int difference; //difference of number1 and number2
   int quotient; //quotient of number1 and number2

   System.out.print("Enter first integer: "); // prompt
   number1 = input.nextInt(); // read first number from user

   System.out.print("Enter second integer: "); // prompt
   number2 = input.nextInt(); // read second number from user

   sum = number1 + number2; // add numbers
   product = number1 * number2; // multiply numbers
   difference = number1 - number2; // subtract numbers
   quotient = number1 / number2; // divide numbers

   System.out.printf(" Sum is %d\n ", sum); //display sum

   System.out.printf(" Product is %d\n ", product); //display prouduct

   System.out.printf(" Difference is %d\n ", difference); //display difference

   System.out.printf(" Quotient is %d\n ", quotient); //display quotient

 } // end method main

} // end class Addition