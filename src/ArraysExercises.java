public class ArraysExercises {


    public static void main(String[] args) {

        Person[] persons = new Person[3];
         persons[0] = new Person("bob", 81);
        persons[1]= new Person("mike", 55);
        persons[2] = new Person("stacy", 99);


        for (Person person : persons) {
            System.out.println(person.getName());
        }

        persons = Person.addPerson(persons, new Person("Dave", 22));


        for (Person person : persons) {
            System.out.println(person.getName());
        }
    }
}
