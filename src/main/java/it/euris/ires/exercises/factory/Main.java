package it.euris.ires.exercises.factory;

import java.util.Scanner;

public class Main {

    /*
    TODO rielaborare il codice di modo che nessuna pizza abbia ingredienti che non usa
    */
    public static void main(String[] args) {
        System.out.println("Inserire pizza richiesta: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();

        if ("MARGHERITA".equals(input)) {
            Pizza margherita = new Pizza();
            margherita.setMozzarella(true);
            margherita.setPomodoro(true);
            margherita.setPrezzo(6);
            stampaPrezzo(margherita);
        } else if ("PROSCIUTTO E FUNGHI".equals(input)) {
            Pizza pf = new Pizza();
            pf.setMozzarella(true);
            pf.setPomodoro(true);
            pf.setFunghi(true);
            pf.setProsciutto(true);
            pf.setPrezzo(8);
            stampaPrezzo(pf);
        } else if ("MARINARA".equals(input)) {
            Pizza marinara = new Pizza();
            marinara.setPomodoro(true);
            marinara.setOrigano(true);
            marinara.setPrezzo(5);
            stampaPrezzo(marinara);
        } else {
            System.out.println("Non vendiamo quel tipo di pizza!");
        }
    }

    //Questo metodo NON può essere modificato
    private static void stampaPrezzo(Pizza pizza) {
        System.out.println("Il prezzo della vostra pizza è: " + pizza.getPrezzo() + " euro");
    }
}
