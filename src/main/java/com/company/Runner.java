package com.company;

/**
 * Created by Dmytro on 22.03.2016.
 */
public class Runner implements Component {
    private Target tatget;

    public Runner(Target tatget) {
        this.tatget = tatget;
    }

    @Override
    public void run(String message) {
        tatget.addMessages(message);
    }
}
