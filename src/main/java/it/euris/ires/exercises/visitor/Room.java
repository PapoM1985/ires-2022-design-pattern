package it.euris.ires.exercises.visitor;

public interface Room {

  default void switchOffLight() {
    System.out.println("Turning off the lights");
  }
}
