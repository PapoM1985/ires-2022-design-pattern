package it.euris.ires.exercises.observer;

import java.util.ArrayList;
import java.util.List;

public class Website {

    private List<String> usersOnline;

    private List<WebsiteObserver> observers;

    public Website() {
        this.usersOnline = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void login(String user) {
        notifyAll(user, WebsiteOperation.LOGIN);
        usersOnline.add(user);
    }

    public void logout(String user) {
        notifyAll(user, WebsiteOperation.LOGOUT);
        usersOnline.remove(user);
    }

    public void addObserver(WebsiteObserver o) {
        observers.add(o);
    }

    public void removeObserver(WebsiteObserver o) {
        observers.remove(o);
    }

    private void notifyAll(String user, WebsiteOperation operation) {
        observers.forEach(o -> o.execute(user, usersOnline, operation));
    }
}
