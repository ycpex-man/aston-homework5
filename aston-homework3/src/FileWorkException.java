public class FileWorkException extends RuntimeException{

    public FileWorkException(String message, Throwable cause){
        super(message, cause);
    }

    public FileWorkException(String message){
        super(message);
    }
}
