package com.dustin;

import com.dustin.ui.UiDrawer;
import com.google.inject.Inject;

public class Application {
    private final UiDrawer uiDrawer;

    @Inject
    public Application(UiDrawer uiDrawer) {
        this.uiDrawer = uiDrawer;
    }

    public void start() {
        uiDrawer.drawUI();
    }
}
