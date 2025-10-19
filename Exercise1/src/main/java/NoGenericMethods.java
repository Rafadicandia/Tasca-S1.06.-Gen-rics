public class NoGenericMethods {

    private Object object1;
    private Object object2;
    private Object object3;


    public NoGenericMethods(Object objA, Object objB, Object objC) {
        this.object1 = objA;
        this.object2 = objB;
        this.object3 = objC;
    }

    public Object getObject1(){
        return object1;
    }

    public Object getObject2(){
        return object2;
    }

    public Object getObject3(){
        return object3;
    }



}