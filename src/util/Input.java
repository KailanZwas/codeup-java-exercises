package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;


    //// Constructors
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    ///Methods
    String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String inputLowered = this.scanner.nextLine().toLowerCase();
        return (inputLowered.equals("y") || inputLowered.equals("yes"));
    }

    public int getInt(int min, int max){
//        System.out.printf("Pick a number between %f - %f", min, max);
        while (true){
            System.out.printf("Enter a number between min and max: ");
            int userInput = scanner.nextInt();
            if (userInput >= min && userInput <= max) {
                return userInput;
            }
        }
    }
    public int getInt(){
    return this.scanner.nextInt();
    }
   public  double getDouble(double min, double max){
       while (true){
           System.out.printf("Enter a number between min and max: ");
           double userInput = scanner.nextDouble();
           if (userInput >= min && userInput <= max) {
               return userInput;
           }
       }
    }
    public double getDouble(){

    return this.scanner.nextDouble();
    }

    public static void main(String[] args) {
        Input i = new Input();
//        System.out.println("HI");
//        System.out.println(i.getString());
//        System.out.println(i.yesNo());
        System.out.println(i.getDouble(10, 100));
//        System.out.println(i.getInt(1, 10));
    }

}
