package org.dogadaev.liquormarket.di;

import android.app.Application;

import org.dogadaev.liquormarket.application.LiquorMarketApplication;
import org.dogadaev.liquormarket.data.LCBORestAdapter;
import org.dogadaev.liquormarket.data.UrlManager;
import org.dogadaev.liquormarket.data.repository.LCBORepository;
import org.dogadaev.liquormarket.data.repository.LCBORepositoryImpl;
import org.dogadaev.liquormarket.presentation.vm.ViewModelFactory;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class ApplicationModule {
    private final Application application;

    public ApplicationModule(LiquorMarketApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    LCBORestAdapter provideLCBORestAdapter(Retrofit retrofit) { return new LCBORestAdapter(retrofit); }

    @Provides
    @Singleton
    Retrofit provideRetrofit() {
        OkHttpClient okHttpClient =
                new OkHttpClient.Builder()
                        .connectTimeout(15, TimeUnit.SECONDS)
                        .readTimeout(15, TimeUnit.SECONDS)
                        .writeTimeout(15, TimeUnit.SECONDS)
                        .retryOnConnectionFailure(true)
                        .build();

        return new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(UrlManager.API_HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    @Provides
    @Singleton
    LCBORepository provideLCBORepository(LCBORestAdapter lcboRestAdapter) { return new LCBORepositoryImpl(lcboRestAdapter); }

    @Provides
    @Singleton
    ViewModelFactory provideViewModelFactory(LCBORepository lcboRepository) { return new ViewModelFactory(lcboRepository); }
}
