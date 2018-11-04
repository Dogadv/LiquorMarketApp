package org.dogadaev.liquormarket.application;

import android.app.Application;

import org.dogadaev.liquormarket.data.model.StoresResponse;
import org.dogadaev.liquormarket.di.ApplicationComponent;
import org.dogadaev.liquormarket.di.ApplicationModule;
import org.dogadaev.liquormarket.di.DaggerApplicationComponent;
import org.dogadaev.liquormarket.presentation.vm.ViewModelFactory;

import javax.inject.Inject;

public class LiquorMarketApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Inject
    ViewModelFactory viewModelFactory;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
        applicationComponent.inject(this);
    }

    public ViewModelFactory getViewModelFactory() {
        return viewModelFactory;
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
