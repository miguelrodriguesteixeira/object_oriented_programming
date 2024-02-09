package prr.core.exception;


import java.io.Serial;

/**
 * Exception when thrown Communication destination is silent
 */
public class DestinationSilentException extends Exception {
    @Serial
    private static final long serialVersionUID = 202208091753L;
    private final String _key;

    public String getKey() {
        return _key;
    }

    public DestinationSilentException(String key) {
        _key = key;
    }
}
