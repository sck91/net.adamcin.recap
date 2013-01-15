package net.adamcin.recap.api;

/**
 * @author madamcin
 * @version $Id: RecapSessionException.java$
 */
public class RecapSessionException extends RecapException {

    public RecapSessionException() {
    }

    public RecapSessionException(String message) {
        super(message);
    }

    public RecapSessionException(String message, Throwable cause) {
        super(message, cause);
    }

    public RecapSessionException(Throwable cause) {
        super(cause);
    }
}