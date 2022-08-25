package com.example.paynet.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Elmurodov Javohir, Mon 11:23 AM. 11/29/2021
 */
@Getter
@AllArgsConstructor
public enum Status {
    HTTP_401(401),
    HTTP_404(404),
    /**
     * User Is not active
     * */
    HTTP_450(450),
    HTTP_500(500);
    private final int code;
}
