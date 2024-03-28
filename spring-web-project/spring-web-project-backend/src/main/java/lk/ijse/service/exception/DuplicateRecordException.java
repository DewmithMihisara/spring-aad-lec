package lk.ijse.service.exception;

/**
 * @author Dewmith Mihisara
 * @date 2024-03-28
 * @since 1.0.0
 */
public class DuplicateRecordException extends ServiceException{
    public DuplicateRecordException(String message) {
        super(message);
    }
}
