package com.example.inps.contoller;

import com.example.inps.service.InpsService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("api/inps/")
public class InpsController {

    private final InpsService inpsService;
    private final WebClient.Builder webClientBuilder;

    @GetMapping("getSalary")
    @CircuitBreaker(name = "inventory", fallbackMethod = "fallbackMethod")
    public ResponseEntity<?> getSalary(@RequestParam String pinfl){
        System.out.println(inpsService.requestPaynet());
        return inpsService.getSalary(pinfl);
    }

    public ResponseEntity<?> fallbackMethod(String pnfl, RuntimeException runtimeException){
        String message = "Paynet service down bro :):)";
        Mono<String> stringMono = webClientBuilder.build().get().uri("http://localhost:8071/?message="+message).retrieve().bodyToMono(String.class);
        System.out.println(stringMono);
        return ResponseEntity.ok("OOOOOOOPs smth went wrong!");
    }

    @GetMapping("get")
    public ResponseEntity<?> get(@RequestParam Long id){
        return inpsService.get(id);
    }
}
