package org.softwaretechnologies;

public class MyException extends Exception {

    private int codeException;

    public MyException(int codeException){
        super("Строка "+codeException+" null.");
        this.codeException=codeException;
    }

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    public int getCodeException() {
        return codeException;
    }
}
