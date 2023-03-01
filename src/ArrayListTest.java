import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("yellow");
        colors.add("blue");
        System.out.println(colors);
        colors.remove(1);
        System.out.println(colors);
        colors.add(0,"green");
        System.out.println(colors);


    }
}
