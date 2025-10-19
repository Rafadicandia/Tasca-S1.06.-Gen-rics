public class Main {

    public static void main(String[] args) {

        NoGenericMethods test = new NoGenericMethods("hello", 0, 9.8 );
        NoGenericMethods test2 = new NoGenericMethods(9, "adios", 'C' );

        System.out.println(test.getObject1().getClass());
        System.out.println(test.getObject2().getClass());
        System.out.println(test.getObject3().getClass());

        System.out.println(test2.getObject1().getClass());
        System.out.println(test2.getObject2().getClass());
        System.out.println(test2.getObject3().getClass());



    }
}
