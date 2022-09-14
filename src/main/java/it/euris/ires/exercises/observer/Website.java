package it.euris.ires.exercises.observer;

import java.util.List;

public class Website {

    private List<String> usersOnline;

    public void login(String user) {
        System.out.println("User " + user + " has logged in website");
        if ("ADMIN".equalsIgnoreCase(user)) {
            System.out.println("Administrator has logged in");
        } else if ("AUDIT".equalsIgnoreCase(user)) {
            System.out.println("Audit User has logged in");
        }
        usersOnline.add(user);
    }

    public void logout(String user) {
        if (usersOnline.contains(user)) {
            System.out.println("User " + user + " has logged out");
            usersOnline.remove(user);
        } else {
            System.out.println("User " + user + " has requested logout but doesn't appear to be online!!");
        }
    }
}
