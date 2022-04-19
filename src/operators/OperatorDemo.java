package operators;

/**
 * unary operator -> pre increment , post increment ,pre decrement, post decrement
 * arithmetic -> + , -, * ,/, %
 * relational -> < ,> , <= , >=
 * logical -> & , | , !
 * bitwise -> && , ||
 * assignment -> = ,<=,>=
 * ternary -> ? :
 * shift -> << ,>>
 *
 */
public class OperatorDemo {
    public static void main(String[] args) {



        boolean flag = false;
//        System.out.println(++a); //a + 1 = a
//        System.out.println(a++); // a = a + 1
//        System.out.println(a);

//        System.out.println(--a);//9 // a-1 = a
//        System.out.println(a--);//9 //a = a-1
//        System.out.println(a);
//        System.out.println(~a);
//        System.out.println(!flag);

//        System.out.println(a%b);
//        System.out.println(a>=b);
//        System.out.println(a<b);

//        System.out.println(a&b);
//        System.out.println(a|b);
//
//        if((a>b) || (a>c)){
//            System.out.println("a is greater");
//        }else {
//            System.out.println("a is not greater");
//        }

//
//        String str = new String("PuNe");
//        String str1 = new String("Pune");
//        System.out.println(str.equalsIgnoreCase(str1));
//        System.out.println(str.equals(str1));


//        if(a>b){
//            System.out.println("a is greater");
//        }else {
//            System.out.println("a is not greater");
//        }
//
//        String str2 = a>b?"a is greater":"a is not greater";
//        System.out.println(str2);

//        System.out.println(a<<b); //a = a*2^b = 40
//        System.out.println(a>>b); //a = a/2^b = 0

        int a = 10, b = 4;
        int c = 11;

        System.out.println(a+b-c*a/b);

    }
}
