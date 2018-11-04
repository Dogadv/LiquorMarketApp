package org.dogadaev.liquormarket.di;

import org.dogadaev.liquormarket.application.LiquorMarketApplication;
import org.dogadaev.liquormarket.presentation.view.fragment.ProductsFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    void inject(LiquorMarketApplication liquorMarketApplication);
    void inject(ProductsFragment productsFragment);
}
