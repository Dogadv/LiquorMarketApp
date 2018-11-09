package org.dogadaev.liquormarket.di;

import org.dogadaev.liquormarket.application.LiquorMarketApplication;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    void inject(LiquorMarketApplication liquorMarketApplication);
}
