package it.euris.ires.exercises.visitor;

public class Kitchen implements Room {

    public void closeWindows(){
        System.out.println("Closing the windows");
    }

    public void turnOffGas(){
        System.out.println("Turning off gas");
    }
}
