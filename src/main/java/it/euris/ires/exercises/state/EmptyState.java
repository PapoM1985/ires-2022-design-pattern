package it.euris.ires.exercises.state;

public class EmptyState implements MachineState {
    private final VendingMachine machine;

    public EmptyState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void onConfirm() {
        if (machine.getDrinks().isEmpty()) {
            System.out.println("Drinks sold out! Please refill and select again");
        } else {
            System.out.println("Drinks restocked, please select");
            machine.setState(new PayedState(machine));
        }
    }

}
