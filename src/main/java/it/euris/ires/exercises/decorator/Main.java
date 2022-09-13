package it.euris.ires.exercises.decorator;

/**
 * Create an order and print it
 */
public class Main {
    public static void main(String[] args) {
        // Create the order
        Order order = new Order();
        order.addCake(new VanillaCake());
        order.addCake(new ChocolateCake());

        // Print the order
        order.printOrder();


        /* TODO
        Aggiungere la possibilità di creare torte con una scritta (stesso prezzo),
        con disegno (prezzo +2) a strati (+5), alla fragola (prezzo * 2)
         */
    }
}
