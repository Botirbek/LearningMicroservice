package com.example.paynet;


import com.example.paynet.enums.Status;
import lombok.Getter;

import java.util.Objects;

@Getter
public class CustomException extends Exception {
    private final Integer status;

    public CustomException(String message, Status status) throws CustomException {
        super(message);
        if (Objects.isNull(status))
            throw new CustomException("Null pointer exception", Status.HTTP_500);
        this.status = status.getCode();
    }

    public CustomException(String message, Integer status) {
        super(message);
        this.status = status;
    }

}
