package com.company;

/**
 * Created by Dmytro on 22.03.2016.
 */
public class ToUpperCaseDecorator extends Decorator {
    protected ToUpperCaseDecorator(Component component) {
        super(component);
    }

    @Override
    public void run(String message) {
        message = message.toUpperCase();
        super.run(message);
    }
}
