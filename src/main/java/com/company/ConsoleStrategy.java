package com.company;

/**
 * Created by Dmytro on 22.03.2016.
 */
public class ConsoleStrategy implements Strategy {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
