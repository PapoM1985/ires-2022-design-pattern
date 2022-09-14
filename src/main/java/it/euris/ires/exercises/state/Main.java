package it.euris.ires.exercises.state;

public class Main {

    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.insertMoney(5);
        machine.selectDrink(); // Messaggio di pagamento non sufficiente

        machine.insertMoney(10);
        machine.selectDrink();
        machine.confirm(); // Messaggio di drink esauriti

        machine.addDrink(new Drink());
        machine.selectDrink(); //Non pago di nuovo
        machine.confirm(); // il risultato deve essere il drink inserito
    }

}
