package it.euris.ires.examples.creational.abstractfactory.example1.woodenfactory;


import it.euris.ires.examples.creational.abstractfactory.example1.Bear;

public class WoodenBear extends Bear {

    @Override
    protected String getName() {
        return "Wooden Bear";
    }

}
