package it.euris.ires.exercises.observer;

import java.util.List;

public class LoginObserver implements WebsiteObserver {
    @Override
    public void execute(String user, List<String> onlineUsers, WebsiteOperation operation) {
        if (operation.equals(WebsiteOperation.LOGIN)) {
            System.out.println("User " + user + " has logged in website");
        }
    }
}
