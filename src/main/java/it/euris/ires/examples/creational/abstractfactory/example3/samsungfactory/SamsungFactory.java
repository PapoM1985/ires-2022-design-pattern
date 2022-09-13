package it.euris.ires.examples.creational.abstractfactory.example3.samsungfactory;


import it.euris.ires.examples.creational.abstractfactory.example3.Laptop;
import it.euris.ires.examples.creational.abstractfactory.example3.Phone;
import it.euris.ires.examples.creational.abstractfactory.example3.TechFactory;

public class SamsungFactory implements TechFactory {

    @Override
    public Laptop getLaptop() {
        return new SamsungLaptop();
    }

    @Override
    public Phone getPhone() {
        return new GalaxyS();
    }

}
