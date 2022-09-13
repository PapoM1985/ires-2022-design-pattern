package it.euris.ires.exercises.factory;

public class Pizza {

    private boolean pomodoro;
    private boolean mozzarella;
    private boolean prosciutto;
    private boolean funghi;

    private boolean origano;
    private int prezzo;

    public void setOrigano(boolean origano) {
        this.origano = origano;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public void setPomodoro(boolean pomodoro) {
        this.pomodoro = pomodoro;
    }

    public void setMozzarella(boolean mozzarella) {
        this.mozzarella = mozzarella;
    }

    public void setProsciutto(boolean prosciutto) {
        this.prosciutto = prosciutto;
    }

    public void setFunghi(boolean funghi) {
        this.funghi = funghi;
    }
}
