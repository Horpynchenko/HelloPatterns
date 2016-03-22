package com.company;

public class Main {

    public static void main(String[] args) {
        Strategy strategy = new ConsoleStrategy();

        new Runner(strategy).run();
    }

}
