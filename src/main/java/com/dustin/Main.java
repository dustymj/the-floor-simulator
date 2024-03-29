package com.dustin;

import com.dustin.module.UiDrawerModule;
import com.dustin.ui.TheFloorUI;
import com.google.inject.Guice;
import com.google.inject.Injector;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new UiDrawerModule());

        Application application = injector.getInstance(Application.class);

        try {
            application.start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\n\nAll done for now...");
    }


}