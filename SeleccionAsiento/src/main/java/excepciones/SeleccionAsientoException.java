package excepciones;

/**
 *
 * @author pedro
 */
public class SeleccionAsientoException extends Exception {

    public SeleccionAsientoException(String message) {
        super(message);
    }

    public SeleccionAsientoException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
