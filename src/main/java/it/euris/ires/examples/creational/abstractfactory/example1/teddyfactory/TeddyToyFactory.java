package it.euris.ires.examples.creational.abstractfactory.example1.teddyfactory;


import it.euris.ires.examples.creational.abstractfactory.example1.Bear;
import it.euris.ires.examples.creational.abstractfactory.example1.Cat;
import it.euris.ires.examples.creational.abstractfactory.example1.ToyFactory;

public class TeddyToyFactory implements ToyFactory {

    @Override
    public Bear getBear() {
        return new TeddyBear();
    }

    @Override
    public Cat getCat() {
        return new TeddyCat();
    }

}
