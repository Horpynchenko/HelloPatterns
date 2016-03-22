package com.company;

/**
 * Created by Dmytro on 22.03.2016.
 */
public final class ConsoleStrategy implements Strategy {
    private static Strategy instance;

    public static Strategy getInstance() {
        return instance = (instance == null) ? new ConsoleStrategy() : instance;
    }

    private ConsoleStrategy(){
        //do nothings
    }

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
