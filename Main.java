import java.util.Scanner;
/**
 * asks user for a number, if divisible by 3 it will say fizz. if divisible by 5 it will say buzz. if divisible by both it will say fizzbuzz. if divisible by neither it will say the number given
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner to get the user's input
    Scanner input = new Scanner(System.in);
    
    //initialize variables
    int integer; //the number given by the user
    int remainder3; //the remainder if the number is divided by 3
    int remainder5; //the remainder if the number is divided by 5

    //initialize constants
    final int NO_REMAINDER = 0; //the number to test if the remainder is 0

    //ask user for starting price
    System.out.println("Please enter a number to play FizzBuzz");
    integer = input.nextInt(); //store it in the starting price variable

    //get divisible by
    remainder3 = integer%3;//get remainder of integer divided by 3 and store it in the variable
    remainder5 = integer%5;//get remainder of integer divided by 5 and store it in the variable

    if (remainder3 == NO_REMAINDER && remainder5 == NO_REMAINDER){ //check if integer is divisible by both 3 and 5
      System.out.println("You should say FizzBuzz"); //say FizzBuzz
    }else if (remainder3 == NO_REMAINDER){ //check if integer is divisible by 3
      System.out.println("You should say Fizz"); //say Fizz
    }else if (remainder5 == NO_REMAINDER){ //check if integer is divisible by 5
      System.out.println("You should say Buzz"); //say Buzz
    }else{ //if it is not divisible by 3 or 5
      System.out.println("You should say " + integer); //say the given integer
    }
  }
}
