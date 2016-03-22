package com.company;

/**
 * Created by Dmytro on 22.03.2016.
 */
public abstract class Decorator implements Component {
    private Component component;

    protected Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void run(String message) {
        component.run(message);
    }
}
