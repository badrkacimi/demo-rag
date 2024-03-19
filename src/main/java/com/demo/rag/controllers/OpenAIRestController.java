package com.demo.rag.controllers;

import org.springframework.ai.chat.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenAIRestController {

    @Autowired
    private ChatClient  chatClient;


    @GetMapping("/chat")
    public String chat(String request){
        return chatClient.call(request);
    }
}
