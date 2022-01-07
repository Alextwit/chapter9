package exception;

public class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }

    private MyException () {}
}
