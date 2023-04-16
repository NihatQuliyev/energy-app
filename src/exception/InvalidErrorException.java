package exception;

import enums.EnergyEnum;
import enums.ExceptionEnum;

public class InvalidErrorException extends RuntimeException{

    public InvalidErrorException() {
        super(ExceptionEnum.INVALID_ERROR.name());
    }
}
