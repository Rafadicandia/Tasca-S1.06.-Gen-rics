public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "This is a person called: "+this.name + " " + this.surname + ". And his/her age is: "+this.age;
    }
}
