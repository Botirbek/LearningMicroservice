package com.example.notificationbot;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BotService {

//    private final BotUsersRepostory botUsersRepostory;
//
//    public boolean isNewUser(String chatId){
//        Optional<String> byChatId = botUsersRepostory.findByChatId(chatId);
//        return byChatId.isPresent()?false:true;
//    }
//
//    public List<String> getUsers(){
//        List<String> list = new ArrayList<>();
//        List<BotUsers> all = botUsersRepostory.findAll();
//        all.stream().forEach(botUsers -> list.add(botUsers.getChatId()));
//        return list;
//    }
//
//    public boolean addUser(BotUsers botUsers){
//        botUsersRepostory.save(botUsers);
//        return true;
//    }
}
