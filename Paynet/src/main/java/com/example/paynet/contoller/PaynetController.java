package com.example.paynet.contoller;

import com.example.paynet.entitiy.PaynetEntity;
import com.example.paynet.service.PaymentSercvice;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("api/paynet/")
public class PaynetController {

    private final PaymentSercvice paymentSercvice;

    @GetMapping("get")
    public ResponseEntity<?> get(@RequestParam String phoneNumber){
        log.info("PaynetController");
        return paymentSercvice.getHistory(phoneNumber);
    }

    @PostMapping("set")
    public ResponseEntity<?> set(@RequestBody @Valid PaynetEntity paynet){
        log.info("PaynetController set");
        return paymentSercvice.save(paynet);
    }

}


