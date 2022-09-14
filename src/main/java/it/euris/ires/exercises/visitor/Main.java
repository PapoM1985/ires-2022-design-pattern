package it.euris.ires.exercises.visitor;

public class Main {

  public static void main(String[] args) {
    House house = new House();
    house.addRoom(new Bedroom());
    house.addRoom(new Bedroom());
    house.addRoom(new Kitchen());
    house.addRoom(new Hallway());
    house.addRoom(new Hallway());
    house.addRoom(new Bathroom());

    house.prepareForVacation();
  }
}
