package com.company;

/**
 * Created by Dmytro on 22.03.2016.
 */
public class Runner {
    private Strategy strategy;

    public Runner(Strategy strategy) {
        this.strategy = strategy;
    }

    public void run() {
        strategy.print("Hello World!");
    }
}
