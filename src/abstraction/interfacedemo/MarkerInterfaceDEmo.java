package abstraction.interfacedemo;

public class MarkerInterfaceDEmo implements MyInterface{
    public static void main(String[] args) {

        MarkerInterfaceDEmo obj = new MarkerInterfaceDEmo();
        if(obj instanceof MyInterface ){
            obj.show();
        }

    }
    public void show(){
        System.out.println("In show");
    }
}

interface MyInterface{

}