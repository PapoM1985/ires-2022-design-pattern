package it.euris.ires.exercises.observer;

import java.util.List;

public class AdminLoginObserver implements WebsiteObserver{
    @Override
    public void execute(String user, List<String> onlineUsers, WebsiteOperation operation) {
        if("ADMIN".equalsIgnoreCase(user) && operation.equals(WebsiteOperation.LOGIN)){
            System.out.println("Administrator has logged in");
        }
    }
}
