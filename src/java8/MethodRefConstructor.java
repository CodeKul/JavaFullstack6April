package java8;

public class MethodRefConstructor {
    public static void main(String[] args) {
        MyInterface7 myInterface7 = MethodRefConstructor::new;
        myInterface7.methodrefConst();

    }
    MethodRefConstructor(){
        System.out.println("In const");
    }
}
interface MyInterface7{
    MethodRefConstructor methodrefConst();

}

