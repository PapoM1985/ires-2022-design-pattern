package it.euris.ires.exercises.state;

public class Main {

    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.insertMoney(5);
        machine.confirm(); // Messaggio di pagamento non sufficiente

        machine.insertMoney(10);
        machine.confirm(); //Ammontare pagato
        machine.confirm(); //Drink Selezionato
        machine.confirm();// Messaggio di drink esauriti

        machine.addDrink(new Drink());
        machine.confirm(); // Drink ricaricati
        machine.confirm(); // Selezione
        machine.confirm(); // Erogazione
    }

}
