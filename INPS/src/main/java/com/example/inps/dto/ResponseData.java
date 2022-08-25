package com.example.inps.dto;

import lombok.Data;

@Data
public class ResponseData {
    boolean succes;
    Object data;
    String error;
}
