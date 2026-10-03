package observer;

import model.ClickEvent;

public class AnalyticsListener implements ClickObserver{
    @Override
    public void onClickRecorded(ClickEvent event){
        System.out.println("[AnalyticsObserver] Logged Click: " + event.getDetails());
    }
}