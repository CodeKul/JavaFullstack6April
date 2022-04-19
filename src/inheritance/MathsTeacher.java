package inheritance;

class Teacher { //parent class , super class , base class
    int id;
    String name;
    String address;

    public static void main(String[] args) {

    }

    public void show() {
        System.out.println("in show");
    }
}

public class MathsTeacher extends Teacher { //child class , sub-class ,derived class

    public static void main(String[] args) {
        MathsTeacher obj = new MathsTeacher();
        obj.id = 1;
        obj.name = "Akash";
        obj.address = "Pune";

        System.out.println(obj.id + " " + obj.name + " " + obj.address);
    }
}

class PhysicsTeacher extends MathsTeacher {

    public void display() {
        PhysicsTeacher obj = new PhysicsTeacher();
        obj.id = 12;
        obj.name = "Prakash";
        obj.address = "Kolhapur";

        System.out.println(obj.id + " " + obj.name + " " + obj.address);
    }

}