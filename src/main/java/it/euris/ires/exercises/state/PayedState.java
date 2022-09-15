package it.euris.ires.exercises.state;

public class PayedState implements MachineState {

    private final VendingMachine machine;

    public PayedState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void onConfirm() {
        System.out.println("The drink has been selected");
        machine.setState(new DrinkSelectedState(machine));
    }

}
