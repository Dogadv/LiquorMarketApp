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
        Observable<ProductsResponse> getProducts(@Query(UrlManager.KEY_ALIAS) final String key, @Query(UrlManager.PAGE_ALIAS) final String page);

        @GET(UrlManager.API_STORES)
        Observable<StoresResponse> getStores(@Query(UrlManager.KEY_ALIAS) final String key, @Query(UrlManager.PAGE_ALIAS) final String page);
    }

    public Observable<ProductsResponse> getProducts(final String key, final String page) {
        return lcboService.getProducts(key, page);
    }

    public Observable<StoresResponse> getStores(final String key, final String page) {
        return lcboService.getStores(key, page);
    }
}
