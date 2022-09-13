package it.euris.ires.examples.creational.abstractfactory.example1.woodenfactory;


import it.euris.ires.examples.creational.abstractfactory.example1.Bear;
import it.euris.ires.examples.creational.abstractfactory.example1.Cat;
import it.euris.ires.examples.creational.abstractfactory.example1.ToyFactory;

public class WoodenToyFactory implements ToyFactory {

    @Override
    public Bear getBear() {
        return new WoodenBear();
    }

    @Override
    public Cat getCat() {
        return new WoodenCat();
    }

}
