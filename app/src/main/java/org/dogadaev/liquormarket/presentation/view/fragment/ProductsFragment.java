package org.dogadaev.liquormarket.presentation.view.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.dogadaev.liquormarket.R;
import org.dogadaev.liquormarket.application.LiquorMarketApplication;
import org.dogadaev.liquormarket.data.model.ProductItem;
import org.dogadaev.liquormarket.presentation.view.adapter.ProductsRecyclerAdapter;
import org.dogadaev.liquormarket.presentation.vm.ProductsViewModel;

import java.util.List;

public class ProductsFragment extends Fragment {

    @BindView(R.id.productsRecycler)
    RecyclerView recyclerView;

    ProductsViewModel productsViewModel;

    public ProductsFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_products, container, false);
        ButterKnife.bind(this, rootView);

        productsViewModel = ViewModelProviders.of(this, ((LiquorMarketApplication) getActivity().getApplication()).getViewModelFactory()).get(ProductsViewModel.class);

        ProductsRecyclerAdapter recyclerAdapter = new ProductsRecyclerAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(recyclerAdapter);

        productsViewModel.getItemsLiveData().observe(getActivity(), recyclerAdapter::updateDataSet);

        return rootView;
    }
}
