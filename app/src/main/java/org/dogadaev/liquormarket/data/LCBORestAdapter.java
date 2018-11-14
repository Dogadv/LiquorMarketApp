package org.dogadaev.liquormarket.data;

import org.dogadaev.liquormarket.data.model.ProductsResponse;
import org.dogadaev.liquormarket.data.model.StoresResponse;

import io.reactivex.Observable;
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
        Observable<ProductsResponse> getProducts(@Query(UrlManager.KEY_ALIAS) final String key, @Query(UrlManager.PAGE_ALIAS) final String page, @Query(UrlManager.SEARCH_ALIAS) final String searchRequest);

        @GET(UrlManager.API_PRODUCTS)
        Observable<ProductsResponse> getProducts(@Query(UrlManager.KEY_ALIAS) final String key, @Query(UrlManager.PAGE_ALIAS) final String page, @Query(UrlManager.SEARCH_ALIAS) final String searchRequest, @Query(UrlManager.WHERE_ALIAS) final String where);


        @GET(UrlManager.API_STORES)
        Observable<StoresResponse> getStores(@Query(UrlManager.KEY_ALIAS) final String key, @Query(UrlManager.PAGE_ALIAS) final String page);
    }

    public Observable<ProductsResponse> getProducts(final String key, final String page, final String searchRequest) {
        return lcboService.getProducts(key, page, searchRequest);
    }

    public Observable<ProductsResponse> getProducts(final String key, final String page, final String searchRequest, final String where) {
        return lcboService.getProducts(key, page, searchRequest, where);
    }

    public Observable<StoresResponse> getStores(final String key, final String page) {
        return lcboService.getStores(key, page);
    }
}
