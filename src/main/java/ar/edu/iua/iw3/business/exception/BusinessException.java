package ar.edu.iua.iw3.business.exception;

import lombok.Builder;
import lombok.NoArgsConstructor;
@NoArgsConstructor
public class BusinessException extends Exception{

    @Builder
    public BusinessException(String message) {
        super(message);
    }

    @Builder
    public BusinessException(Throwable cause) {
        super(cause);
    }

    @Builder
    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
