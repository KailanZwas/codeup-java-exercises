package SubStringTest;



public class SubstringTest {


    public static void main(String[] args) {
        try {
            SubString es = new SubString();
            System.out.println(es.testString.length());
            String newSubString = es.testString.substring(25);
            System.out.println(newSubString);
        } catch (IndexOutOfBoundsException iobx) {
            System.out.println("that is out of bounds");
//            iobx.printStackTrace();
        }

    }
}
