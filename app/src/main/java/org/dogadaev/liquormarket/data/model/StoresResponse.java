package org.dogadaev.liquormarket.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class StoresResponse {

    @SerializedName("status")
    private final int status;

    @SerializedName("message")
    private final String message;

    @SerializedName("pager")
    private final PageConfiguration pageConfiguration;

    @SerializedName("result")
    private final List<StoreItem> items;

    StoresResponse(int status, String message, PageConfiguration pageConfiguration, List<StoreItem> items) {
        this.status = status;
        this.message = message;
        this.pageConfiguration = pageConfiguration;
        this.items = items;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public PageConfiguration getPageConfiguration() {
        return pageConfiguration;
    }

    public List<StoreItem> getItems() {
        return items;
    }

}
