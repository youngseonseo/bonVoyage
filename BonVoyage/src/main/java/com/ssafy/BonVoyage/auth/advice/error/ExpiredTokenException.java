package com.ssafy.BonVoyage.auth.advice.error;


import com.ssafy.BonVoyage.auth.advice.payload.ErrorCode;
import org.springframework.security.core.AuthenticationException;

public class ExpiredTokenException extends AuthenticationException {

    private ErrorCode errorCode;

    public ExpiredTokenException(String msg, Throwable t) {
        super(msg, t);
        this.errorCode = ErrorCode.INVALID_REPRESENTATION;
    }

    public ExpiredTokenException(String msg) {
        super(msg);
    }

    public ExpiredTokenException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

}
