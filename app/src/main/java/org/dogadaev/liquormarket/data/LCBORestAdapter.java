package org.dogadaev.liquormarket.data;

import org.dogadaev.liquormarket.data.model.ProductsResponse;
import org.dogadaev.liquormarket.data.model.StoresResponse;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class LCBORestAdapter {

    private final LCBOService lcboService;

    public LCBORestAdapter(Retrofit retrofit) {
        this.lcboService = retrofit.create(LCBOService.class);
    }

    interface LCBOService {
        @GET(UrlManager.API_PRODUCTS)
        Observable<ProductsResponse> getProducts(@Query(UrlManager.KEY_ALIAS) final String key);

        @GET(UrlManager.API_STORES)
        Observable<StoresResponse> getStores(@Query(UrlManager.KEY_ALIAS) final String key);
    }

    public Observable<ProductsResponse> getProducts(final String key) {
        return lcboService.getProducts(key);
    }

    public Observable<StoresResponse> getStores(final String key) {
        return lcboService.getStores(key);
    }
}
