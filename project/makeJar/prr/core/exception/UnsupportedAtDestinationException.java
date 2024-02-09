package prr.core.exception;


import java.io.Serial;

/**
 * Exception thrown when the communication's destination terminal doesn't support that kind of communication
 */
public class UnsupportedAtDestinationException extends Exception {
    @Serial
    private static final long serialVersionUID = 202208091753L;
    private final String _key;


    public String getKey() {
        return _key;
    }

    public UnsupportedAtDestinationException(String key) {
        _key = key;
    }
}
