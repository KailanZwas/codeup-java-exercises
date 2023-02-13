public class MethodsLecture {
    public static void main(String[] args) {
//        System.out.println("zenith");
//    }
//
    }
    // ----------- DEFINING AND CALLING METHODS WITH VARIOUS INPUTS (examples)

    // no input or returned output
//        public static void sayGreeting() {
//            System.out.println("Hello");
//        }

    // no returned output with input
//        public static void sayInput(String input) {
//            System.out.println(input);
//        }

    // returned output without input
//        public static int returnSeven() {
//            return 7;
//        }

    // return output given an input
    public static int returnInt(int someInt) {
        return someInt;
    }
}


    // return value based on multiple inputs
//        public static double returnProductOfThreeNums(double num1, double num2, double num3) {
//            return num1 * num2 * num3;
//        }

    // return type different from input type
//        public static int returnLengthOfString(String input) {
//            return input.length();
//        }

    // multiple input types
//        public static void printCharMultipleTimes(char c, int repetitions) {
//            System.out.println(String.valueOf(c).repeat(repetitions));
//        }

    // calling other methods from a method
//        public static void printCharSevenTimes(char c) {
//            printCharMultipleTimes(c, returnSeven());
//        }


    // ----------- OVERLOADING

    /*

        Method overloading is a way to define the same method with different method signatures.
        It is a convenience to prevent the programmer from having to create many more method names
        when defining functionality for various data type inputs.

        Much of the Java language is defined using overloaded methods (e.g. println())


     */

//        public static void sayHello() {
//            System.out.println("Hello World");
//        }
//
//        public static void sayHello(String punctuation) {
//            System.out.println("Hello World" + punctuation);
//        }
//
//        public static void sayHello(int times) {
//            for (int i = 0; i < times; i += 1) {
//                sayHello();
//            }
//        }


    // different return type is not enough alone to overload a method
    // must have a unique method signature

//         public static double sayHello(int x) {
//            return x;
//         }

    // with a unique method signature, can return any type
//        public static double sayHello(double x) {
//            return x;
//        }


    /**
     * OVERLOAD MINI-EXERCISES
     */

    // TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return
    //  a greeting message to the user by either their first or first and last name.

    // example: sayName("Justin") - "Hi Justin"
    // example: sayName("Justin", "Reich") - "Hi Justin Reich"


    // TODO: overload the math exercises from the curriculum exercise to work with both integers and doubles
//
//    public static int add(int num1, int num2) {
//        return num1 + num2;
//    }
//
//
//}












//import java.util.Scanner;

//public class SyntaxLecture {


//    public static void main(String[] args) {
//    float x;
//    x = 3.5f;
//        int y = 10;
//
//        System.out.println(y);


// ================== STATEMENTS (s-3)

        // Statements may be...
        // Declarations
//        int x;

        // Assignment expressions
//         x = 3;

        // Any use of ++ or --
//         x++;
//         --x;

        // Method invocations
//         Math.random();

        // Object creation expressions
//         SomeObject = new SomeObject();

        // ================== COMMENTS (s-4)

        // single line comment

        /*

            multi-line comment

         */

        /**
         * Comment block
         */

//        System.out.println("test");


        // ================== DATA TYPES (s-5, 6, 7)

//        int primitiveExample = 3;
//        System.out.println(primitiveExample);


//        Student referenceExample = new Student();

        // use the smallest type needed for the job

        // primitive types...

//        byte age = -32;
//        System.out.println(age);
//        short minimumAnnualSalary = 15080;
//        int distanceToSaturn = 1200000000;
//        long numberOfHumanCells = 3000000000L; // L needed for compiler
//        System.out.println(numberOfHumanCells);
//        float lengthOfBacteriaInInches = 0.00004F; // F needed for compiler
//        System.out.println(lengthOfBacteriaInInches);
//        double widthOfAtomInMeters = .00000000001;
//        char seatingSection = 'M'; // must wrap in single quotes
//        boolean everythingIsAwesome = false;

        // strings (not a primitive type)

//         String thisIsAString = "Hello";


//          like in JS, strings must escape certain characters like quotes and use it to inject newline characters and other formatting

//        System.out.println("Hello\nWorld");
//        System.out.print("Hello");
//        System.out.print("World");

//        System.out.println("He said \"Hi\"");
//
//        String hello = "Hello";
//        char someLetter = hello.charAt(0);
//        System.out.println(someLetter);


        // ================== VARIABLES (s-8)

        // declaration separate from initialization

//             int seven;
//             seven = 7;
//            System.out.println(seven);

        // declaration and initialization

//             int eight = 8;
//        System.out.println(eight);

//Scanner sc = new Scanner(System.in);
//        System.out.println("Enter somthing you dont like.");
//        String input
        // ================== IDENTIFIERS AND KEYWORDS (s-9)

        // see curriculum


        // ================== CONSTANTS (s-10)

        // see curriculum

//        final int SIDES_OF_A_DICE = 6;


        // ================== EXPRESSIONS (s-11)

        // basically the same as JS


        // ================== OPERATORS (s-12)

        // basically the same as JS


        // ================== ASSIGNMENT STATEMENTS (s-13)

        // basically the same as JS


        // ================== CASTING (s-14)

        // Link on casting... http://www.javainterviewpoint.com/type-casting-java-implicit-explicit-casting/

        // IMPLICIT
//        short x = 4;
//        int y = x;
//        System.out.println(x);
//        System.out.println(y);


        // EXPLICIT
//        int a = 2000001;
//        byte b = (byte) a;
//        System.out.println(a);
//        System.out.println(b);


        // implicit casting - less to more precise (widening)

//         float num1 = 2.22F;
//         double num2 = num1;


        // explicit casting - more to less explicit casting (narrowing)

//         double num3 = 3.1;
//         float num4 = (float) num3;
//         System.out.println(num4);





//        write a program to get the user age and print out how old they will be in 10 years

//        import scanner

////        create a scanner
//        Scanner sc = new Scanner(System.in);
////        promt the user with sout to enter age
//        System.out.println("enter your age: ");
////        get age with scanner neextLIne
//        String userAge = sc.nextLine();
////        use sout to print out the user age plus 10
//        System.out.println(userNumAge + 10);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your favorite holiday.");
//        String favoriteHoliday = sc.nextLine();
//
//        System.out.println("my favorite holiday is: %S", favoriteHoliday);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter your age: ");
//        int age = scanner.nextInt();
//        System.out.println(age);


//
//    }
////}

