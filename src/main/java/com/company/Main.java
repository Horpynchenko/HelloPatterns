package com.company;

public class Main {

    public static void main(String[] args) {
        String message = "Hello World!";

        Component component = new Runner(new Adapter(ConsoleStrategy.getInstance()));

        component = new ToUpperCaseDecorator(component);
        component = new ReplaceToDecorator(component, "-");
        component.run(message);

    }

}
