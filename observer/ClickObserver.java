package observer;

import model.ClickEvent;

public interface ClickObserver{
    void onClickRecorded(ClickEvent event);
}