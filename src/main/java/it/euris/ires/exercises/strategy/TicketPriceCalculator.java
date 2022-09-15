package it.euris.ires.exercises.strategy;

public class TicketPriceCalculator {

    public double calculatePrice(Spectator spectator, int ticketAmount) {

        double price = 0;
        if (spectator.isStaff()) {
            //Per lo staff prezzo speciale esentasse
            price = 8.0;
        } else if (spectator.getAge() < 16) {
            //Per i teenager prezzo ridotto tassato
            price = 10.0; //base price
            price += price * 0.05;//tax
        } else if (spectator.getAge() >= 16 && spectator.getAge() < 65) {
            //Per gli adulti prezzo pieno tassato
            price = 12.0; //base price
            price += price * 0.05; //tax
        } else if (spectator.getAge() >= 65) {
            //Per gli anziani ridotto a tasso ridotto
            price = 8.0;
            price += price * 0.01;
        }

        return price * ticketAmount;
    }
}
