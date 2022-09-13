package it.euris.ires.examples.behavioral.state.example1;

public abstract class State {

    public void handleRequest() {
        System.out.println("Shouldn't be able to get here");
    }

}
