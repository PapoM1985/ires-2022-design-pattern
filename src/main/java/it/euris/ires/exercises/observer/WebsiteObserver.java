package it.euris.ires.exercises.observer;

import java.util.List;

public interface WebsiteObserver {

    void execute(String user, List<String> onlineUsers, WebsiteOperation operation);
}
