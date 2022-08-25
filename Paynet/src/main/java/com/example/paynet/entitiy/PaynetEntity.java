package com.example.paynet.entitiy;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

@Data
@Entity
public class PaynetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Positive(message = "validation positive")
    private BigDecimal summa;

}
