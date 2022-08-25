package com.example.inps.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaynetDto {
    private Long id;
    private String phoneNumber;
    private BigDecimal summa;
}
