package observer;

import model.ClickEvent;
import java.util.List;
import java.util.concurrent.*;

public class ClickEventManager{
    private final List<ClickObserver> observers = new CopyOnWriteArrayList<>();
    private final ExecutorService executorService = Executors.newFixedThreadPool(2);

    public void subscribe(ClickObserver observer){
        observers.add(observer);
    }
    public void unsubscribe(ClickObserver observer){
        observers.remove(observer);
    }
    public void notifyObservers(ClickEvent event){
        for(ClickObserver observer : observers){
            executorService.submit(() -> observer.onClickRecorded(event));
        }
    }
}