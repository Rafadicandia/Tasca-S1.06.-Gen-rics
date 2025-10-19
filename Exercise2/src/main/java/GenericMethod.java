public class GenericMethod {

    public <T, U, X>  void printInfo(U arg1, T arg2, X arg3){
        System.out.println(arg1.getClass().getName());
        System.out.println(arg2.getClass().getName());
        System.out.println(arg3.getClass().getName());


    }
}
