package it.euris.ires.exercises.state;

public class DrinkSelectedState implements MachineState {

    private VendingMachine machine;

    public DrinkSelectedState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void onConfirm() {
        if (machine.getDrinks().isEmpty()) {
            System.out.println("Drinks sold out! Please refill and select again");
            machine.setState(new EmptyState(machine));
        } else {
            System.out.println("Here is you drink!");
            machine.setState(new NotPayedState(machine));
        }
    }

}
