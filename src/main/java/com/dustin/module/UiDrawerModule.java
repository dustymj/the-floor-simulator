package com.dustin.module;

import com.dustin.ui.UiDrawer;
import com.dustin.ui.impl.UiDrawerImpl;
import com.google.inject.AbstractModule;

public class UiDrawerModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(UiDrawer.class).to(UiDrawerImpl.class);
    }
}
