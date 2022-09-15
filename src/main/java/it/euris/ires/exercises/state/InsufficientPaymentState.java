package it.euris.ires.exercises.state;

public class InsufficientPaymentState implements MachineState {

    private final VendingMachine machine;

    public InsufficientPaymentState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void onConfirm() {
        if (machine.getAmountInserted() >= machine.getPrice()) {
            machine.setState(new PayedState(machine));
        } else {
            System.out.println("Not enough coins: insert " + (machine.getPrice() - machine.getAmountInserted()) + " more");
        }
    }

}
