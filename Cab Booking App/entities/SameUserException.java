package model.exceptions;

public class SameUserException extends Exception {

    public SameUserException() {
        super();
    }

    public SameUserException(String message) {
        super(message);
    }

}
