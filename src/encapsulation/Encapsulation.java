package encapsulation;

public class Encapsulation {

    //global variable. instance variable , class level variable
    private int id;
    private String name;
    private String address;

    public int getId() {
        return id;
    }
    public void setId(int eId) {//local variable
        if(eId != 0){
            this.id = eId;
        }else {
            System.out.println("value is zero");
        }
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

class Sample {

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setId(1);
        System.out.println(obj.getId());
    }
}