package it.euris.ires.exercises.observer;

import java.util.List;

public class AuditLoginObserver implements WebsiteObserver{
    @Override
    public void execute(String user, List<String> onlineUsers, WebsiteOperation operation) {
        if("AUDIT".equalsIgnoreCase(user)  && operation.equals(WebsiteOperation.LOGIN)){
            System.out.println("Audit User has logged in");
        }
    }
}
