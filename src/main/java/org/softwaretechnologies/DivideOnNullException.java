package org.softwaretechnologies;

public class DivideOnNullException extends RuntimeException {

    public DivideOnNullException(RuntimeException exception) {
        super(exception);
    }
}
