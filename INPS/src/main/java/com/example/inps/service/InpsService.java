package com.example.inps.service;

import com.example.inps.dto.PaynetDto;
import com.example.inps.entitiy.InpsEntity;
import com.example.inps.repository.InpsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InpsService {

    private final InpsRepository inpsRepository;
    private final WebClient.Builder webClientBuilder;

    public ResponseEntity<?> getSalary(String pinfl){
        Optional<InpsEntity> byPinfl = inpsRepository.findByPinfl(pinfl);

        if (byPinfl.isPresent()){
            return ResponseEntity.ok(byPinfl.get().getSalary());
        }
        return ResponseEntity.ok("Pinfl not found");
    }

    public ResponseEntity<?> get(Long id){
        System.out.println(id);
        Optional<InpsEntity> byPinfl = inpsRepository.findById(id);

        if (byPinfl.isPresent()){
            return ResponseEntity.ok(byPinfl.get().getSalary());
        }
        return ResponseEntity.ok("Pinfl not found");
    }


    public ResponseEntity<?> requestPaynet(){

        PaynetDto [] response = webClientBuilder.build().get()
                .uri("http://Paynet/api/paynet/get?phoneNumber=12")
                .retrieve()
                .bodyToMono(PaynetDto[].class)
                .block();

        System.out.println(Arrays.toString(response));
        return ResponseEntity.ok(response);
    }

}
