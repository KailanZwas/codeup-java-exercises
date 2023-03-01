package util;

import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Enter your input:");
        return scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    // Solution: David Lara and John Pedrotti
    public boolean yesNo(){
        System.out.println("Yes or no?");
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    /*
        TODO: refactor this method to use Integer.valueOf(getString()) and surround it with a try-catch block to
         to catch the NumberFormatException. If the exception is caught, call the getInt() method again.
     */
    public int getInt(){
        String userInput = getString();
        try {
            return Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input type. Enter a number!");
            return getInt();
        }
    }

//    public static void main(String[] args) {
//        Input input = new Input();
//        System.out.println("Enter a number!");
//        int num = input.getInt();
//        System.out.println(num);
//    }

    public int getInt(String prompt){
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public int getInt(int min, int max){
        String prompt = "Enter an integer between " + min + " and " + max + ":";
        System.out.println(prompt);
        int userInput = getInt();
        while (userInput < min || userInput > max){
            System.out.println(prompt);
            userInput = scanner.nextInt();
        }
        return userInput;
    }

    /*
        TODO: refactor this method to use Double.valueOf(getString()) and surround it with a try-catch block to
         to catch the NumberFormatException. If the exception is caught, call the getDouble() method again.
     */
    public double getDouble(){
        String userInput = getString();
        try {
            return Double.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input type. Enter a number!");
            return getInt();
        }
    }

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Enter a number!");
        double num = input.getDouble();
        System.out.println(num);
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    public double getDouble(double min, double max){
        String prompt = "Enter an number between " + min + " and " + max + ":";
        System.out.println(prompt);
        double userInput = getDouble();
        while (userInput < min || userInput > max){
            System.out.println(prompt);
            userInput = scanner.nextDouble();
        }
        return userInput;
    }
}




























//import java.util.Scanner;
//
//public class Input {
//    private Scanner scanner;
//
//
//    //// Constructors
//    public Input() {
//        this.scanner = new Scanner(System.in);
//    }
//
//    ///Methods
//    String getString() {
//        return scanner.nextLine();
//    }
//
//    public boolean yesNo() {
//        String inputLowered = this.scanner.nextLine().toLowerCase();
//        return (inputLowered.equals("y") || inputLowered.equals("yes"));
//    }
//
//
//    public int getInt(int min, int max){
////        System.out.printf("Pick a number between %f - %f", min, max);
//        while (true){
//            System.out.printf("Enter a number between min and max: ");
//            int userInput = scanner.nextInt();
//            // String userInput = scanner.getString()
//            // int userIntInput = Integer.valueOf(userInput)
//            if (userInput >= min && userInput <= max) {
//                return userInput;
//            }
//        }
//    }
//    public int getInt(){
//    return this.scanner.nextInt();
//    }
//   public  double getDouble(double min, double max){
//       while (true){
//           System.out.printf("Enter a number between min and max: ");
//           double userInput = scanner.nextDouble();
//           if (userInput >= min && userInput <= max) {
//               return userInput;
//           }
//       }
//    }
//    public double getDouble(){
//
//    return this.scanner.nextDouble();
//    }
//
//    public static void main(String[] args) {
//        Input i = new Input();
////        System.out.println("HI");
////        System.out.println(i.getString());
////        System.out.println(i.yesNo());
//        System.out.println(i.getDouble(10, 100));
////        System.out.println(i.getInt(1, 10));
//    }
//
//}
