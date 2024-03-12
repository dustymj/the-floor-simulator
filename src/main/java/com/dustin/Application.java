package com.dustin;

import com.dustin.data.TheFloor;
import com.dustin.ui.TheFloorUI;
import com.dustin.ui.UiDrawer;
import com.google.inject.Inject;

import javax.swing.*;

public class Application {
    private final UiDrawer uiDrawer;

    @Inject
    public Application(UiDrawer uiDrawer) {
        this.uiDrawer = uiDrawer;
    }

    public void start() throws InterruptedException {
        TheFloor theFloor = new TheFloor();

        SwingUtilities.invokeLater(() -> {
            new TheFloorUI(theFloor).setVisible(true);
        });
    }
}
