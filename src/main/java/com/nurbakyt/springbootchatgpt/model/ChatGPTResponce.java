package com.nurbakyt.springbootchatgpt.model;

import lombok.Data;

import java.util.List;

@Data
public class ChatGPTResponce {
    private List<ChatGPTChoice> choices;

}
