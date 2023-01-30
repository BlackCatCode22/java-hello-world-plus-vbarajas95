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
    String userName = "Vanessa";
    String greeting = "It is so great to welcome you into this program";
    Scanner scanner = new Scanner(System.in);

    System.out.println("Hello user, what is your preferred name?");
    userName = scanner.nextLine();

    System.out.println("Good morning" + scanner + "It is so great to welcome you into this program");

  }
}
