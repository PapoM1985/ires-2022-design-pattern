package it.euris.ires.exercises.state;

import java.util.ArrayDeque;
import java.util.Deque;

public class VendingMachine {

    private static Integer THE_PRICE = 10;
    private Deque<Drink> drinks = new ArrayDeque<>();

    public boolean insertMoney(Integer amount) {
        //TODO deve verificare che l'ammontare sia sufficiente, altrimenti risulta false
        return true;
    }

    public boolean selectDrink() {
        //TODO se prima non ha inserito abbastanza soldi deve dare false
        //TODO deve verificare che ci siano ancora drink disponibili, altrimenti false
        return true;
    }

    public Drink confirm() {
        //TODO non deve essere possibile chiamarlo prima della selezione
        if (drinks.isEmpty()) {
            //TODO deve tornare prima della selezione ma dopo il pagamento
        }
        //TODO ritorna la bibita e si riporta a prima del pagamento
        return drinks.pop();
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }
}
