package org.dogadaev.liquormarket.data.repository;

import org.dogadaev.liquormarket.data.LCBORestAdapter;
import org.dogadaev.liquormarket.data.model.ProductsResponse;
import org.dogadaev.liquormarket.data.model.StoresResponse;

import io.reactivex.Observable;

public class LCBORepositoryImpl implements LCBORepository {

    private final LCBORestAdapter restAdapter;

    public LCBORepositoryImpl(LCBORestAdapter restAdapter) {
        this.restAdapter = restAdapter;
    }

    @Override
    public Observable<ProductsResponse> getProducts(final String key, final String page) {
        return restAdapter.getProducts(key, page);
    }

    @Override
    public Observable<StoresResponse> getStores(final String key, final String page) {
        return restAdapter.getStores(key, page);
    }
}
