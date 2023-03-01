import java.util.Scanner;

public class MethodsExercises {

    public static int addMethod(int a, int b) {
        return a + b;
    }

    public static int subMethod(int a, int b) {
        return a - b;
    }

    public static int divideMethod(int a, int b) {
        return a / b;
    }

    public static int multiplyMethod(int a, int b) {
        return a * b;
    }
//        public static int modulas


    // TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return
//  a greeting message to the user by either their first or first and last name.
    public static String sayName(String firstName) {
        return "Hi " + firstName;
    }
    public static   String sayName(String firstName, String lastName){
        return "Hi " + firstName + "" + lastName;
    }
// example: sayName("Justin") - "Hi Justin"
// example: sayName("Justin", "Reich") - "Hi Justin Reich"


// TODO: overload the math exercises from the curriculum exercise to work with both integers and doubles

    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    public static int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

//    todo: Create a method that validates that user input is in a certain range and returns that input as an integer
//     if it is within the given range. If not, prompt the user to input their number again until the input is within range.

    public static int getInteger(int min, int max){
        Scanner sc =  new Scanner(System.in);

        while (true){
            System.out.printf("Enter a number between min and max: ");
           int userInput = sc.nextInt();
            if (userInput >= min && userInput <= max) {
                return userInput;
            }
        }
    }

//    todo:Calculate the factorial of a number. Prompt the user to enter an integer from 1 to 10. Display the factorial
//     of the number entered by the user. Ask if the user wants to continue.  Use a for loop to calculate the factorial.
//     Assume that the user will enter an integer, but verify it’s between 1 and 10. Use the long type to store the
//     factorial. Continue only if the user agrees to. A factorial is a number multiplied by each of the numbers before it.
//     Factorials are denoted by the exclamation point (n!). Ex: logging

    public static int calculateFactorial(int num1, int num2) {
        Scanner sc = new Scanner(System.in);
// Prompt user for number 1 -10
        System.out.println("Enter a integer from 1 to 10");
// Collect user input
        int userInput = getInteger(1, 10);
// print user input
        System.out.println(userInput);
        boolean userContinue = true;
        boolean userDontContinue = false;
// Ask user if they want to continue
        System.out.println("Continue? [y/N] ");
// collect user input
        String userContinueInput = sc.next();
// todo:check user input y/n

// todo: fork input path


        return userInput;
    }


    public static void main(String[] args) {
//        System.out.println(addMethod(5, 3));
//        System.out.println(subMethod(5, 2));
//        System.out.println(divideMethod(5, 5));
//        System.out.println(multiplyMethod(5, 5));
//        System.out.println(sayName("Batman"));
//        System.out.println(sayName("Bruce, Wayne"));
//        System.out.println(add(5,5));
//       System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        System.out.println(userInput);
        System.out.println(calculateFactorial(5,5));

        //Create an application that simulates dice rolling.
// todo Ask the user to enter the number of sides for a pair of dice.
        System.out.println("Welcome to the Dice Game! Please enter the number of sides ");
// todo Prompt the user to roll the dice.
Scanner scanner = new Scanner(System.in);
// todo   "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.


  //todo Use static methods to implement the method(s) that generate the random numbers.

// todo  Use the .random method of the java.lang.Math class to generate random numbers.


    }
}