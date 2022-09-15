package it.euris.ires.exercises.observer;

import java.util.List;

public class LogoutObserver implements WebsiteObserver {
    @Override
    public void execute(String user, List<String> onlineUsers, WebsiteOperation operation) {
        if (operation.equals(WebsiteOperation.LOGOUT)) {
            if (onlineUsers.contains(user)) {
                System.out.println("User " + user + " has logged out");
            } else {
                System.out.println("User " + user + " has requested logout but doesn't appear to be online!!");
            }
        }
    }
}
