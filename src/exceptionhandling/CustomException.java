package exceptionhandling;

public class CustomException {

    private void add() throws MyException {
        throw new MyException("Adding failed");
    }

    public static void main(String[] args) throws MyException {
        CustomException exception = new CustomException();
        exception.add();
    }
}

class MyException extends Exception{
    MyException(String str){
        super(str);
    }

}