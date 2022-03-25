package exceptions;

public class LoginException extends Exception{
    public LoginException(String error) {
        super(error);
    }
}
