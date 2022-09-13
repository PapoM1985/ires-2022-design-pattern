package it.euris.ires.examples.creational.abstractfactory.example1.woodenfactory;


import it.euris.ires.examples.creational.abstractfactory.example1.Cat;

public class WoodenCat extends Cat {

    @Override
    protected String getName() {
        return "Wooden Cat";
    }

}
