package com.dustin;

import com.dustin.data.TheFloor;
import com.dustin.ui.UiDrawer;
import com.google.inject.Inject;

public class Application {
    private final UiDrawer uiDrawer;

    @Inject
    public Application(UiDrawer uiDrawer) {
        this.uiDrawer = uiDrawer;
    }

    public void start() throws InterruptedException {
        TheFloor theFloor = new TheFloor();

        String ui = uiDrawer.getUI(theFloor);
        System.out.print(ui);
    }
}
