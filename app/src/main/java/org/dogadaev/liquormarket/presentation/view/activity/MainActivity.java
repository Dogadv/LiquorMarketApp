package org.dogadaev.liquormarket.presentation.view.activity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import org.dogadaev.liquormarket.R;
import org.dogadaev.liquormarket.presentation.view.fragment.ProductsFragment;

import java.util.concurrent.TimeUnit;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.searchField)
    EditText searchField;

    ProductsFragment productsFragment;

    private final CompositeDisposable disposables = new CompositeDisposable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        final ActionBar actionbar = getSupportActionBar();
        if (actionbar != null) {
            actionbar.setDisplayHomeAsUpEnabled(false);
            actionbar.setDisplayShowTitleEnabled(false);
        }

        productsFragment = new ProductsFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.mainFragmentContainer, productsFragment).commit();
        disposables.add(Observable.create(emitter -> {
            TextWatcher watcher = new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    if (!emitter.isDisposed()) {
                        emitter.onNext(editable.toString());
                    }
                }
            };
            emitter.setCancellable(() -> searchField.removeTextChangedListener(watcher));
            searchField.addTextChangedListener(watcher);
        })
                .map(o -> {
                    String s;
                    if (!o.toString().isEmpty()) {
                        s = o.toString().toLowerCase();
                        if (s.contains(" ")) s = s.replace(" ", "+");
                    } else s = " ";

                    return s;
                })
                .subscribeOn(Schedulers.io())
                .debounce(300, TimeUnit.MILLISECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(productsFragment::textTyped));
    }
}
