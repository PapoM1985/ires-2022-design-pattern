package it.euris.ires.exercises.visitor;

public class Bathroom implements Room {

  public void closeWindows() {
    System.out.println("Closing the windows");
  }

  public void closeFaucet() {
    System.out.println("Closing the water faucet");
  }
}
