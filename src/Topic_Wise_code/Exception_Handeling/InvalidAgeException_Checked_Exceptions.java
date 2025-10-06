package Topic_Wise_code.Exception_Handeling;

public class InvalidAgeException_Checked_Exceptions extends Exception{
    public InvalidAgeException_Checked_Exceptions(String message){
        super(message);
    }
    public InvalidAgeException_Checked_Exceptions(String message, Throwable cause){
        super(message,cause);
    }
}
