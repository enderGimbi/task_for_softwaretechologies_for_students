package org.softwaretechnologies;

public class DivideOnNullException extends RuntimeException {

    public DivideOnNullException() {
    }

    public DivideOnNullException(String message) {
        super(message);
    }

    public DivideOnNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public DivideOnNullException(Throwable cause) {
        super(cause);
    }
}
