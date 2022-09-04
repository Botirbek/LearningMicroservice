package com.example.notificationbot;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BotController {

    private final NotificationBot notificationBot;

    @GetMapping
    public ResponseEntity<?> sendSms(@RequestParam String message){
        notificationBot.send(message);
        return ResponseEntity.ok().body("Success");
    }
}
