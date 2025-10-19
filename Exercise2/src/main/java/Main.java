public class Main {
    public static void main(String[] args) {
        Person person = new Person("Pepe", "Pepino", 45);

        GenericMethod.printInfo(person, "Hello", 6);

        GenericMethod.printInfo("Labubu", person, 6.9);






    }
}
