package it.euris.ires.exercises.visitor;

import java.util.ArrayList;
import java.util.List;

public class House {

  private List<Room> rooms;

  public House() {
    this.rooms = new ArrayList<>();
  }

  public void addRoom(Room room) {
    rooms.add(room);
  }

  public void prepareForVacation() {
    for (Room room : rooms) {
      if (room instanceof Bathroom) {
        Bathroom bathroom = (Bathroom) room;
        bathroom.closeFaucet();
        bathroom.closeWindows();
        bathroom.switchOffLight();
      } else if (room instanceof Bedroom) {
        Bedroom bedroom = (Bedroom) room;
        bedroom.makeBed();
        bedroom.closeWindows();
        bedroom.switchOffLight();
      } else if (room instanceof Hallway) {
        Hallway hallway = (Hallway) room;
        hallway.switchOffLight();
      } else if (room instanceof Kitchen) {
        Kitchen kitchen = (Kitchen) room;
        kitchen.turnOffGas();
        kitchen.closeWindows();
        kitchen.switchOffLight();
      }
    }
    System.out.println("All done!");
  }
}
