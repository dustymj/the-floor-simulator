package com.dustin;

import com.dustin.module.UiDrawerModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new UiDrawerModule());

        Application application = injector.getInstance(Application.class);

        application.start();
        System.out.println("\n\nAll done for now...");
    }


}