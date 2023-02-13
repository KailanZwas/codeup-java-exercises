public class MethodsExercises {

        public static int addMethod ( int a, int b){
            return a + b;
        }
        public static int subMethod (int a, int b){
            return a - b;
        }
        public static int divideMethod (int a , int b){
            return a / b;
        }
        public static int multiplyMethod (int a , int b){
            return a * b;
        }

//    logging
    public static void main(String[] args) {
        System.out.println(addMethod(5, 3));
        System.out.println(subMethod(5,2));
        System.out.println(divideMethod(5,5));
        System.out.println(multiplyMethod(5,5));
    }
}