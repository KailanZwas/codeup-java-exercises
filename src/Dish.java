// TODO: 2/14/23 Create a class called Dish. This class will represent various restaurant dishes. Include an integer
//  property called “costInCents” Include a string property called “nameOfDish” Include a boolean property called “wouldRecommend”
//  Include a method called “printSummary” with a void return type this method will use a single printf method to print
//  out the values of each of the instance properties in the following format:
//  Cost: COST_IN_CENTS_HERE
//  Name: NAME_OF_DISH_HERE
//  Recommended: BOOLEAN_VALUE_OF_WOULD_RECOMMEND_HERE
// TODO: 2/14/23   another class called DishTest
//  Add a main method and inside the method...
//    1) instantiate a Dish object and assign to a variable called dish1
//    2) assign creative values for each of the properties
//    3) test the printSummary() method by invoking it and checking if all instance values are correctly printed


public class Dish {

    private String name;
    private int price;
    private boolean rating;

    public void printSummary(){

        System.out.printf("Jack Quins popular dish, %s\n It is priced at $%s\n It has a rating %s\n", name, price, rating);
    }

    public Dish(String name, int price, boolean rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Dish(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isRating() {
        return rating;
    }

    public void setRating(boolean rating) {
        this.rating = rating;
    }
}
