public class DishTest {

    public  static void main(String[] args){
        Dish dish1 = new Dish();
        dish1.setName("Sheperads Pie");
        dish1.setPrice(15);
        dish1.setRating(true);


        Dish dish2 = new Dish();
        dish2.setName("pizza");
        dish2.setPrice(22);
        dish2.setRating( true);

        dish1.printSummary();
        dish2.printSummary();
    }
}
