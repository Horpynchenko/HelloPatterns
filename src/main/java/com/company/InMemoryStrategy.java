package com.company;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Dmytro on 22.03.2016.
 */
public class InMemoryStrategy implements Strategy {
    private List<String> messages = new LinkedList<>();

    @Override
    public void print(String message) {
        messages.add(message);
    }

    public List<String> getMessages() {
        return messages;
    }
}
