package org.dogadaev.liquormarket.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProductsResponse {

    @SerializedName("status")
    private final int status;

    @SerializedName("message")
    private final String message;

    @SerializedName("pager")
    private final PageConfiguration pageConfiguration;

    @SerializedName("result")
    private final List<ProductItem> items;

    @SerializedName("suggestion")
    private final String suggestion;

    ProductsResponse(int status, String message, PageConfiguration pageConfiguration, List<ProductItem> items, String suggestion) {
        this.status = status;
        this.message = message;
        this.pageConfiguration = pageConfiguration;
        this.items = items;
        this.suggestion = suggestion;
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

    public List<ProductItem> getItems() {
        return items;
    }

    public String getSuggestion() {
        return suggestion;
    }
}
