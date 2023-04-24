public class InvalidNumberException extends Exception {
    private static String errormessage = "This number is invalid!";

    public InvalidNumberException(String message) {
        super(message);
    }

    public String getMessage() {
        return errormessage;
    }
}
