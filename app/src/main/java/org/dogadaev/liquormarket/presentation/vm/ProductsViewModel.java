package org.dogadaev.liquormarket.presentation.vm;

import android.app.Application;
import android.widget.Toast;

import org.dogadaev.liquormarket.R;
import org.dogadaev.liquormarket.data.model.PageConfiguration;
import org.dogadaev.liquormarket.data.model.ProductItem;
import org.dogadaev.liquormarket.data.repository.LCBORepository;
import org.dogadaev.liquormarket.util.NetworkUtils;

import java.util.List;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class ProductsViewModel extends ViewModel {

    private static final String KEY = "MDo4YWUxZGEwNi1kZjRkLTExZTgtYjkxYi0xMzA1ZWYxNjg0ZGY6MGc4M0hhU2JBM1FBdW9CME1JSkZ5MUI5UjRPS2FLTHFCaTR3";

    private final LCBORepository repository;
    private final CompositeDisposable disposables = new CompositeDisposable();
    private final MutableLiveData<List<ProductItem>> itemsLiveData = new MutableLiveData<>();
    private final MutableLiveData<PageConfiguration> pageConfigurationLiveData = new MutableLiveData<>();

    ProductsViewModel(Application application, LCBORepository repository) {
        this.repository = repository;
        if (NetworkUtils.isNetworkConnected(application))
            hitLCBOApi("1", "");
        else Toast.makeText(application, R.string.noInternetToast, Toast.LENGTH_LONG).show();
    }

    public void hitLCBOApi(String page, String searchRequest) {
        disposables.add(repository.getProducts(KEY, page, searchRequest)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(response -> {
                    itemsLiveData.setValue(response.getItems());
                    pageConfigurationLiveData.setValue(response.getPageConfiguration());
                })
        );
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        disposables.clear();
        disposables.dispose();
    }

    public MutableLiveData<List<ProductItem>> getItemsLiveData() {
        return itemsLiveData;
    }

    public MutableLiveData<PageConfiguration> getPageConfigurationLiveData() {
        return pageConfigurationLiveData;
    }
}
