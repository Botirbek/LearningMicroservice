package com.example.inps.contoller;

import com.example.inps.service.InpsService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("api/inps/")
public class InpsController {

    private final InpsService inpsService;

    @GetMapping("getSalary")
    @CircuitBreaker(name = "inventory", fallbackMethod = "fallbackMethod")
    public ResponseEntity<?> getSalary(@RequestParam String pinfl){
        System.out.println(inpsService.requestPaynet());
        return inpsService.getSalary(pinfl);
    }

    public ResponseEntity<?> fallbackMethod(String pnfl, RuntimeException runtimeException){
        return ResponseEntity.ok("OOOOOOOPs smth went wrong!");
    }

    @GetMapping("get")
    public ResponseEntity<?> get(@RequestParam Long id){
        return inpsService.get(id);
    }
}
