package Topic_Wise_code.Exception_Handeling;

public class InvalidAgeException_Unchecked_Exceptions extends RuntimeException {
    public InvalidAgeException_Unchecked_Exceptions(String message){
        super(message);
    }
    public InvalidAgeException_Unchecked_Exceptions(String message, Throwable cause){
        super(message,cause);
    }
}
