package it.euris.ires.exercises.state;

public class NotPayedState implements MachineState {

    private final VendingMachine machine;

    public NotPayedState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void onConfirm() {
        if (machine.getAmountInserted() == 0) {
            System.out.println("Please insert " + machine.getPrice() + " coins");
        } else if (machine.getAmountInserted() > machine.getPrice()) {
            machine.setState(new PayedState(machine));
        } else {
            System.out.println("Not enough coins: insert " + (machine.getPrice() - machine.getAmountInserted()) + " more");
            machine.setState(new InsufficientPaymentState(machine));
        }
    }
}
