public class Products {
//    * TODO: create an array of doubles called numbers and assign five different values
//     (try with and without an initializer).
//    Find the sum of all five double values using an enhanced for loop.
// */

    private String name;
    private double priceInCents;

    ///contstructor
    public Products() {

    }

    public Products(String name, double priceInCents) {
        this.name = name;
        this.priceInCents = priceInCents;
    }

    public Products(String name) {
        this.name = name;
    }

    public Products(double priceInCents) {
        this.priceInCents = priceInCents;
        this.name = "unassigned";
    }

    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceInCents() {
        return priceInCents;
    }

    public void setPriceInCents(double priceInCents) {
        this.priceInCents = priceInCents;
    }

//    double total = 0;
//    dboutle average = 0;
//    for(
//    product product :products)
//
//    {
//        total += product.priceincents;
//    }
//
//    average =total /proctucst.length;
//    return average;
//}

    public static void main(String[] args) {
//        double[] numbers = { 4, 7, 19, 83, 68};
//        double total = 0;
//        for (double number : numbers){
//            total += number;
//        }
//        System.out.printf(String.valueOf(numbers(total));


        /* TODO: create a class called Product with two private properties of name and priceInCents.
    Add a public static method called, find average price that takes in an array of products
    and finds the average price of all products. Add a main method to the class to test some
    values.
 */
       Products[] items = new Products[4];
       items[0] = new Products("coke",  5 );
        items[1] = new Products("pepsi",  .75 );
        items[2] = new Products("rootbeer", .75 );
        items[3] = new Products("coke", .75 );
    }
}
