package org.dogadaev.liquormarket.data.repository;

import org.dogadaev.liquormarket.data.LCBORestAdapter;
import org.dogadaev.liquormarket.data.model.ProductsResponse;
import org.dogadaev.liquormarket.data.model.StoresResponse;

import androidx.lifecycle.LiveData;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class LCBORepositoryImpl implements LCBORepository {

    private final LCBORestAdapter restAdapter;

    public LCBORepositoryImpl(LCBORestAdapter restAdapter) {
        this.restAdapter = restAdapter;
    }

    @Override
    public Observable<ProductsResponse> getProducts(final String key) {
        return restAdapter.getProducts(key);
    }

    @Override
    public Observable<StoresResponse> getStores(final String key) {
        return restAdapter.getStores(key);
    }
}
