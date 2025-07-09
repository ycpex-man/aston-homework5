public class MyException  extends Exception{

    public MyException(String message, Throwable cause){
        super(message, cause);
    }

    public MyException(String message){
        super(message);
    }
}
