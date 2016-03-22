package com.company;

/**
 * Created by Dmytro on 22.03.2016.
 */
public class ReplaceToDecorator extends Decorator{
    private String replacemant;

    public ReplaceToDecorator(Component component, String replacemant) {
        super(component);
        this.replacemant = replacemant;
    }

    @Override
    public void run(String message) {
        super.run(message.replaceAll(" ", replacemant));
    }
}
