package org.dogadaev.liquormarket.presentation.vm;

import org.dogadaev.liquormarket.data.repository.LCBORepository;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class ViewModelFactory implements ViewModelProvider.Factory {

    private final LCBORepository lcboRepository;

    public ViewModelFactory(LCBORepository lcboRepository) {
        this.lcboRepository = lcboRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(ProductsViewModel.class))
            return (T) new ProductsViewModel(lcboRepository);
        else throw new IllegalArgumentException("ViewModel Not Found");
    }
}
