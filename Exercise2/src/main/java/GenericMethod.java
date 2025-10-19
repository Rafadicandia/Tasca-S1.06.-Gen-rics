public class GenericMethod {

    public static <T, U, X>  void printInfo(U arg1, T arg2, X arg3){
        System.out.println("First parameter: " +arg1);
        System.out.println("Second parameter: " +arg2);
        System.out.println("Second parameter: " +arg3);


    }
}
