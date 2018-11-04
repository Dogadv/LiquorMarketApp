package org.dogadaev.liquormarket.data.model;

import com.google.gson.annotations.SerializedName;

public class PageConfiguration {

    @SerializedName("records_per_page")
    private final int recordsPerPage;

    @SerializedName("total_record_count")
    private final int totalRecordCount;

    @SerializedName("current_page_record_count")
    private final int currentPageRecordCount;

    @SerializedName("is_first_page")
    private final boolean isFirstPage;

    @SerializedName("is_final_page")
    private final boolean isFinalPage;

    @SerializedName("current_page")
    private final int currentPage;

    @SerializedName("current_page_path")
    private final String currentPagePath;

    @SerializedName("next_page")
    private final int nextPage;

    @SerializedName("next_page_path")
    private final String nextPagePath;

    @SerializedName("previous_page")
    private final int previousPage;

    @SerializedName("previous_page_path")
    private final String previousPagePath;

    @SerializedName("total_pages")
    private final int totalPages;

    @SerializedName("total_pages_path")
    private final String totalPagesPath;

    PageConfiguration(int recordsPerPage, int totalRecordCount, int currentPageRecordCount, boolean isFirstPage, boolean isFinalPage, int currentPage, String currentPagePath, int nextPage, String nextPagePath, int previousPage, String previousPagePath, int totalPages, String totalPagesPath) {
        this.recordsPerPage = recordsPerPage;
        this.totalRecordCount = totalRecordCount;
        this.currentPageRecordCount = currentPageRecordCount;
        this.isFirstPage = isFirstPage;
        this.isFinalPage = isFinalPage;
        this.currentPage = currentPage;
        this.currentPagePath = currentPagePath;
        this.nextPage = nextPage;
        this.nextPagePath = nextPagePath;
        this.previousPage = previousPage;
        this.previousPagePath = previousPagePath;
        this.totalPages = totalPages;
        this.totalPagesPath = totalPagesPath;
    }

    public int getRecordsPerPage() {
        return recordsPerPage;
    }

    public int getTotalRecordCount() {
        return totalRecordCount;
    }

    public int getCurrentPageRecordCount() {
        return currentPageRecordCount;
    }

    public boolean isFirstPage() {
        return isFirstPage;
    }

    public boolean isFinalPage() {
        return isFinalPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public String getCurrentPagePath() {
        return currentPagePath;
    }

    public int getNextPage() {
        return nextPage;
    }

    public String getNextPagePath() {
        return nextPagePath;
    }

    public int getPreviousPage() {
        return previousPage;
    }

    public String getPreviousPagePath() {
        return previousPagePath;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public String getTotalPagesPath() {
        return totalPagesPath;
    }
}
