package staticdemo;

public  class StaticDemo {

    static String companyName = "ABC";
    int id;
    String name;

    static {
        System.out.println("in static block");
        companyName = "XYZ";
    }

    public void show(){
        companyName = "xyz";
    }

    public StaticDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {

        System.out.println("In main method");
        StaticDemo obj1 = new StaticDemo(1, "Akash");
        StaticDemo obj2 = new StaticDemo(2, "Ravi");
        StaticDemo obj3 = new StaticDemo(3, "Suhas");
        System.out.println("id=>" + obj1.id + " name=>" + obj1.name + " companyName=>" + companyName);

//        show();

    }
}
