public class Person {
    private String name;
    private int age;

    public String getName(){
//TODO: return the person's name
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello, " + name);
    }

    // Getters && Setters
    public Person(){

    }
    public Person(String name){
        this.name = name;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main (String[] args){
//    Person person1 = new Person();
//    person1.name = "Batman";
//      person1.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());


    }

}

