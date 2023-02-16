public class ArraysExercises {


    public static void main(String[] args) {

        Person[] persons = new Person[3];
         persons[0] = new Person("bob", 81);
        persons[1]= new Person("mike", 55);
        persons[2] = new Person("stacy", 99);


        for ( int i = 0; i < persons.length; i += 1 ){
            System.out.println(persons[i].getName());
        }

    }
}
