package exception;

import enums.ExceptionEnum;

public class NotFoundException extends RuntimeException{

    public NotFoundException() {
        super(ExceptionEnum.NOT_FOUND.name());
    }
}
