package gov.irs;

/*
 *application custom exception - and is checked.
 */

public class IllegalWageException extends Exception {

//fields
//constructor

    public IllegalWageException() {
    }

    public IllegalWageException(String message) {
        super(message);
    }

    public IllegalWageException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalWageException(Throwable cause) {
        super(cause);
    }

//business method
//helper method
//accessor method get/set/toString
}