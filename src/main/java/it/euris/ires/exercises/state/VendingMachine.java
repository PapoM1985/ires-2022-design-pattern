package it.euris.ires.exercises.state;

import java.util.ArrayDeque;
import java.util.Deque;

public class VendingMachine {

    private Integer price;
    private Deque<Drink> drinks;
    private Integer amountInserted;
    private boolean drinkSelected;

    private MachineState state;

    public VendingMachine() {
        drinks = new ArrayDeque<>();
        amountInserted = 0;
        price = 10;
        state = new NotPayedState(this);
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
        this.state.onConfirm();
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public Integer getPrice() {
        return price;
    }

    public Deque<Drink> getDrinks() {
        return drinks;
    }

    public Integer getAmountInserted() {
        return amountInserted;
    }


    public boolean isDrinkSelected() {
        return drinkSelected;
    }

    public MachineState getState() {
        return state;
    }

    public void setState(MachineState state) {
        this.state = state;
    }
}
