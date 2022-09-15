package it.euris.ires.exercises.observer;

public class Main {

    public static void main(String[] args) {
        Website w = new Website();
        w.addObserver(new LoginObserver());
        w.addObserver(new AdminLoginObserver());
        w.addObserver(new AuditLoginObserver());
        w.addObserver(new LogoutObserver());

        w.login("John");
        w.logout("John");
        w.login("admin");
        w.login("audit");
        w.logout("Mary");
    }
}
