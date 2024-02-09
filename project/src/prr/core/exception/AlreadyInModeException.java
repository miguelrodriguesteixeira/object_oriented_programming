package prr.core.exception;

import java.io.Serial;

/**
 * Exception thrown when TerminalMode is already in the mode that it has been commanded to
 */
public class AlreadyInModeException extends Exception {
    @Serial
    private static final long serialVersionUID = 202208091753L;
}
