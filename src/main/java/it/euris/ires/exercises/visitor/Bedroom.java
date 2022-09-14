package it.euris.ires.exercises.visitor;

public class Bedroom implements Room {

  public void closeWindows() {
    System.out.println("Closing the windows");
  }

  public void makeBed() {
    System.out.println("Making the bed");
  }
}
