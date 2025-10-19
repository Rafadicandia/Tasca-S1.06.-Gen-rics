public class Main {

    public static void main(String[] args) {

        String A = "Hello";
        String B = "Goodbye";
        String C = "Hello Again";

        NoGenericMethods test = new NoGenericMethods(A, B, C);
        NoGenericMethods test2 = new NoGenericMethods(B,C, A);

        System.out.println(test.getObject1());
        System.out.println(test.getObject2());
        System.out.println(test.getObject3());

        System.out.println(test2.getObject1());
        System.out.println(test2.getObject2());
        System.out.println(test2.getObject3());







    }
}
