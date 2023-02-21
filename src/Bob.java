//public static void main(String[] args) throws InterruptedException {
//
//        {
//        Scanner scanner = new Scanner(System.in);
//        int conversation = 5;  // this is how many times to ask a ?
//        String userEnter; // this capture the user string input
//        String sentence = "Conversation with Bob the lackadaisical teenage";
//        String[] words = sentence.split(" "); //what is this doing? it splits a sentence?
//        for(String word : words) {    // this says that the word plus the string... we wait so there is no thrown interuption?....
//        System.out.print(word + " ");
//        Thread.sleep(100);
//        }
//
//        do{
//        conversation --;  // above we set the int at five so we say this loops 5 times
////                System.out.println("Conversation with Bob the lackadaisical teenage");
//        userEnter = scanner.nextLine();
//        if(userEnter.endsWith("!")){
//        System.out.println("Whoa, chill out!");
//        } else if (userEnter.endsWith("?")) {
//        System.out.println("Sure.");
//        } else if (userEnter.isEmpty()) {
//        System.out.println("Fine. Be that way!");
//        } else if (userEnter.startsWith("bye")) {
//        System.out.println("Conversation with Bob has ended");
//        break;
//        } else { //if none of the above are a factor it response whatever
//        System.out.println("Whatever.");
//        }
//        }while(conversation != 0); // it will keep running if it doesnt equal 0
//
//        if(conversation == 0){ // it stops if it equals 0
//        System.out.println("Conversation with Bob has ended");
//        }
//
//




//import java.util.Scanner;
//
//public class Bob {
//    public static void main(String[] args) {
//
//
//        String userInput;
//        do {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Bob is a lackadaisical teenager, try asking him a question");
//            userInput = sc.next();
//            if (userInput.endsWith("?")) {
//                System.out.println("Sure");
//            } else if (userInput.endsWith("!")) {
//                System.out.println("Whoa, chill out!");
//            } else if (userInput.isEmpty()) {
//                System.out.println("Whatever");
//            }
//        } while (userInput.equals("bye"));
//        System.out.println("Goodbye!");
//
//    }
//}
