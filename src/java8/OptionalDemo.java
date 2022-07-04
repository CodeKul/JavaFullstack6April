package java8;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        Student student = new Student(1,"Rahul",null);

        System.out.println(student.getAddress());
//        System.out.println(student.getAddress().length());

       /* if(student.getAddress() != null){
            System.out.println(student.getAddress().length());
        }else {
            System.out.println("address is null");
        }

        Optional<String> optional = Optional.empty();

        System.out.println(optional);*/

//        Optional<String> optional1 = Optional.of(student.getAddress());
//        System.out.println(optional1);

        Optional<String> optional2 = Optional.ofNullable(student.getAddress());
        System.out.println(optional2);

    }
}

class Student{

    int id;

    String name;

    String address;

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}