package it.euris.ires.exercises.state;

import java.util.ArrayDeque;
import java.util.Deque;

public class VendingMachine {

  private static Integer THE_PRICE = 10;
  private Deque<Drink> drinks;
  private Integer amountInserted;
  private boolean drinkSelected;

  public VendingMachine() {
    drinks = new ArrayDeque<>();
    amountInserted = 0;
  }

  public void insertMoney(Integer amount) {
    amountInserted += amount;
  }

  private void selectDrink() {
    drinkSelected = true;
  }

  private void unSelectDrink() {
    drinkSelected = false;
  }

  public void confirm() {
    if (amountInserted == 0) {
      System.out.println("Please insert " + THE_PRICE + "coins");
    } else if (amountInserted < THE_PRICE) {
      System.out.println("Not enough coins: insert " + (THE_PRICE - amountInserted) + " more");
    } else if (!drinkSelected) {
      selectDrink();
    } else if (drinks.isEmpty()) {
      System.out.println("Drinks sold out! Please refill and select again");
      unSelectDrink();
    } else {
      System.out.println("Here is you drink!");
      unSelectDrink();
      drinks.remove();
      amountInserted = 0;
    }
  }

  public void addDrink(Drink drink) {
    drinks.add(drink);
  }
}
