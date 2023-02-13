import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {


        String userInput;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bob is a lackadaisical teenager, try asking him a question");
            userInput = sc.next();
            if (userInput.endsWith("?")) {
                System.out.println("Sure");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.isEmpty()) {
                System.out.println("Whatever");
            }
        } while (userInput.equals("bye"));
        System.out.println("Goodbye!");

    }
}
