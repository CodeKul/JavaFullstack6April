package controlstatement;

public class SwitchCase {
    public static void main(String[] args) {

        int num = 1;

        switch (num){
            case 1:
                int i = 1;
                switch (i){
                    case 1:
                        System.out.println("In first case");
                        break;
                    case 2:
                        System.out.println("in case 2");
                        break;
                    case 3:
                        System.out.println("in case 3");
                }
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            default:
                System.out.println("no matches");

        }
    }
}
