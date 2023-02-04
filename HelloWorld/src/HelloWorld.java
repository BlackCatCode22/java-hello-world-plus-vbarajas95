// Name of Programmer: Vanessa Barajas
// Name of Program: Java CIT 63
// Date Started: 1/29/2023
// Description of program: Ask user for her first name and echo back in a greeting.
// Input/Processing/Output: user input in console, output is System.out in console
// Purpose of program: CIT-63 Assignment Spring 2023
//
// References:
// https://www.w3schools.com/java/java_user_input.asp

import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args) {
    // Input: Obtain user name
    Scanner scanner_one = new Scanner(System.in);
    System.out.println("Hello user, what is your name?");
    //Variable declaration center
    String userName = scanner_one.nextLine();
    //Create greeting
    String greeting = ",it is so great to finally meet you! Welcome to Java!";
  // Output:
    System.out.println("Good morning " + String.valueOf(userName) + String.valueOf(greeting));

  }
}
