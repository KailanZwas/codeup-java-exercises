
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

    //    logging
    public static void main(String[] args) {
        System.out.println(addMethod(5, 3));
        System.out.println(subMethod(5, 2));
        System.out.println(divideMethod(5, 5));
        System.out.println(multiplyMethod(5, 5));
        System.out.println(sayName("Batman"));
        System.out.println(sayName("Bruce, Wayne"));
        System.out.println(add(5,5));

    }
}