package com.example.paynet.service;

import com.example.paynet.repository.PaynetRepository;
import com.example.paynet.entitiy.PaynetEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentSercvice {

    private final PaynetRepository paynetRepository;

    @GetMapping
    public ResponseEntity<?>  getHistory(String phoneNumber){
        List<PaynetEntity> list = paynetRepository.findByPhoneNumber(phoneNumber);
        return ResponseEntity.ok(list);
    }

    public ResponseEntity<?> save(PaynetEntity paynet) {
        paynetRepository.save(paynet);
        return ResponseEntity.ok("succes");
    }
}
