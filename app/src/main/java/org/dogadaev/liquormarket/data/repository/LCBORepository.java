package org.dogadaev.liquormarket.data.repository;

import org.dogadaev.liquormarket.data.model.ProductsResponse;
import org.dogadaev.liquormarket.data.model.StoresResponse;

import io.reactivex.Observable;

public interface LCBORepository {
    Observable<ProductsResponse> getProducts(final String key, final String page);
    Observable<StoresResponse> getStores(final String key, final String page);
}
