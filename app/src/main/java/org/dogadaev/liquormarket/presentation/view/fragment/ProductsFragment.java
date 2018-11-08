package org.dogadaev.liquormarket.presentation.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.dogadaev.liquormarket.R;
import org.dogadaev.liquormarket.application.LiquorMarketApplication;
import org.dogadaev.liquormarket.presentation.view.adapter.EndlessScrollListener;
import org.dogadaev.liquormarket.presentation.view.adapter.ProductsRecyclerAdapter;
import org.dogadaev.liquormarket.presentation.vm.ProductsViewModel;

import java.lang.ref.WeakReference;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ProductsFragment extends Fragment {

    @BindView(R.id.productsRecycler)
    RecyclerView recyclerView;

    private ProductsViewModel productsViewModel;
    private ProductsRecyclerAdapter recyclerAdapter;

    private String searchRequest;

    public ProductsFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_products, container, false);
        ButterKnife.bind(this, rootView);

        productsViewModel = ViewModelProviders.of(this, ((LiquorMarketApplication) getActivity().getApplication()).getViewModelFactory()).get(ProductsViewModel.class);

        recyclerView.setHasFixedSize(true);
        recyclerAdapter = new ProductsRecyclerAdapter(new WeakReference<>(getContext()));
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerAdapter);

        productsViewModel.getItemsLiveData().observe(this, recyclerAdapter::addData);

        recyclerView.addOnScrollListener(new EndlessScrollListener(productsViewModel.getPageConfigurationLiveData(), this, layoutManager) {
            @Override
            public void scrolledToBottom(String nextPage) {
                productsViewModel.hitLCBOApi(nextPage, searchRequest);

            }
        });

        return rootView;
    }

    public void textTyped(String searchRequest) {
        this.searchRequest = searchRequest;
        recyclerAdapter.clearData();
        productsViewModel.hitLCBOApi("1", searchRequest);
    }
}
