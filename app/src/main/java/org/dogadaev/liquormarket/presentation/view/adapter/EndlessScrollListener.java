package org.dogadaev.liquormarket.presentation.view.adapter;

import android.widget.NumberPicker;

import org.dogadaev.liquormarket.data.model.PageConfiguration;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public abstract class EndlessScrollListener extends RecyclerView.OnScrollListener {

    private boolean scrolled = false;
    private int pastVisibleItems, visibleItemCount, totalItemCount, nextPage, maxPages, currentPage;

    private LinearLayoutManager layoutManager;

    public EndlessScrollListener(MutableLiveData<PageConfiguration> pageConfigurationLiveData, LifecycleOwner lifecycleOwner, LinearLayoutManager layoutManager) {
        super();
        this.layoutManager = layoutManager;
        pageConfigurationLiveData.observe(lifecycleOwner, pageConfiguration -> {
            nextPage = pageConfiguration.getNextPage();
            maxPages = pageConfiguration.getTotalPages();
            currentPage = pageConfiguration.getCurrentPage();
        });
    }

    @Override
    public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
        super.onScrollStateChanged(recyclerView, newState);
        if (currentPage < maxPages)
            if (newState == NumberPicker.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL) {
                scrolled = true;
            }
    }

    @Override
    public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);
        if (currentPage < maxPages)
            if (dy > 0) {
                visibleItemCount = layoutManager.getChildCount();
                totalItemCount = layoutManager.getItemCount();
                pastVisibleItems = layoutManager.findFirstVisibleItemPosition();

                if (scrolled && ((visibleItemCount + pastVisibleItems) == totalItemCount)) {
                    scrolled = false;
                    scrolledToBottom(nextPage + "");
                }
            }
    }

    public abstract void scrolledToBottom(String nextPage);
}
