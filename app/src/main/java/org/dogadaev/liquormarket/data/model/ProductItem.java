package org.dogadaev.liquormarket.data.model;

import com.google.gson.annotations.SerializedName;

public class ProductItem {

    @SerializedName("id")
    private final int id;

    @SerializedName("is_dead")
    private final boolean isDead;

    @SerializedName("name")
    private final String name;

    @SerializedName("tags")
    private final String tags;

    @SerializedName("is_discontinued")
    private final boolean isDiscontinued;

    @SerializedName("price_in_cents")
    private final int priceInCents;

    @SerializedName("regular_price_in_cents")
    private final int regularPriceInCents;

    @SerializedName("limited_time_offer_savings_in_cents")
    private final int limitedTimeOfferSavingsInCents;

    @SerializedName("limited_time_offer_ends_on")
    private final String limitedTimeOfferEndsOn;

    @SerializedName("bonus_reward_miles")
    private final int bonusRewardMiles;

    @SerializedName("bonus_reward_miles_ends_on")
    private final String bonusRewardMilesEndsOn;

    @SerializedName("stock_type")
    private final String stockType;

    @SerializedName("primary_category")
    private final String primaryCategory;

    @SerializedName("secondary_category")
    private final String secondaryCategory;

    @SerializedName("origin")
    private final String origin;

    @SerializedName("package")
    private final String packageType;

    @SerializedName("package_unit_type")
    private final String packageUnitType;

    @SerializedName("package_unit_volume_in_milliliters")
    private final int packageUnitVolumeInMilliliters;

    @SerializedName("total_package_units")
    private final int totalPackageUnits;

    @SerializedName("volume_in_milliliters")
    private final int volumeInMilliliters;

    @SerializedName("alcohol_content")
    private final int alcoholContent;

    @SerializedName("price_per_liter_of_alcohol_in_cents")
    private final int pricePerLiterOfAlcoholInCents;

    @SerializedName("price_per_liter_in_cents")
    private final int pricePerLiterInCents;

    @SerializedName("inventory_count")
    private final int inventoryCount;

    @SerializedName("inventory_volume_in_milliliters")
    private final int inventoryVolumeInMilliliters;

    @SerializedName("inventory_price_in_cents")
    private final int inventoryPriceInCents;

    @SerializedName("sugar_content")
    private final String sugarContent;

    @SerializedName("producer_name")
    private final String producerName;

    @SerializedName("released_on")
    private final String releasedOn;

    @SerializedName("has_value_added_promotion")
    private final boolean hasValueAddedPromotion;

    @SerializedName("has_limited_time_offer")
    private final boolean hasLimitedTimeOffer;

    @SerializedName("has_bonus_reward_miles")
    private final boolean hasBonusRewardMiles;

    @SerializedName("is_seasonal")
    private final boolean isSeasonal;

    @SerializedName("is_vqa")
    private final boolean isVqa;

    @SerializedName("is_ocb")
    private final boolean isOcb;

    @SerializedName("is_kosher")
    private final boolean isKosher;

    @SerializedName("value_added_promotion_description")
    private final String valueAddedPromotionDescription;

    @SerializedName("description")
    private final String description;

    @SerializedName("serving_suggestion")
    private final String survingSuggestion;

    @SerializedName("tasting_note")
    private final String tastingNote;

    /**
     * Example format: "2018-11-02T14:20:07.669Z"
     */
    @SerializedName("updated_at")
    private final String updatedAt;

    @SerializedName("image_thumb_url")
    private final String imageThumbUrl;

    @SerializedName("image_url")
    private final String imageUrl;

    @SerializedName("varietal")
    private final String varietal;

    @SerializedName("style")
    private final String style;

    @SerializedName("tertiary_category")
    private final String tertiaryCategory;

    @SerializedName("sugar_in_grams_per_liter")
    private final int sugarInGramsPerLiter;

    @SerializedName("clearance_sale_savings_in_cents")
    private final int clearanceSaleSavingInCents;

    @SerializedName("has_clearance_sale")
    private final boolean hasClearanceSale;

    @SerializedName("product_no")
    private final int productNo;

    ProductItem(int id, boolean isDead, String name, String tags, boolean isDiscontinued, int priceInCents, int regularPriceInCents, int limitedTimeOfferSavingsInCents, String limitedTimeOfferEndsOn, int bonusRewardMiles, String bonusRewardMilesEndsOn, String stockType, String primaryCategory, String secondaryCategory, String origin, String packageType, String packageUnitType, int packageUnitVolumeInMilliliters, int totalPackageUnits, int volumeInMilliliters, int alcoholContent, int pricePerLiterOfAlcoholInCents, int pricePerLiterInCents, int inventoryCount, int inventoryVolumeInMilliliters, int inventoryPriceInCents, String sugarContent, String producerName, String releasedOn, boolean hasValueAddedPromotion, boolean hasLimitedTimeOffer, boolean hasBonusRewardMiles, boolean isSeasonal, boolean isVqa, boolean isOcb, boolean isKosher, String valueAddedPromotionDescription, String description, String survingSuggestion, String tastingNote, String updatedAt, String imageThumbUrl, String imageUrl, String varietal, String style, String tertiaryCategory, int sugarInGramsPerLiter, int clearanceSaleSavingInCents, boolean hasClearanceSale, int productNo) {
        this.id = id;
        this.isDead = isDead;
        this.name = name;
        this.tags = tags;
        this.isDiscontinued = isDiscontinued;
        this.priceInCents = priceInCents;
        this.regularPriceInCents = regularPriceInCents;
        this.limitedTimeOfferSavingsInCents = limitedTimeOfferSavingsInCents;
        this.limitedTimeOfferEndsOn = limitedTimeOfferEndsOn;
        this.bonusRewardMiles = bonusRewardMiles;
        this.bonusRewardMilesEndsOn = bonusRewardMilesEndsOn;
        this.stockType = stockType;
        this.primaryCategory = primaryCategory;
        this.secondaryCategory = secondaryCategory;
        this.origin = origin;
        this.packageType = packageType;
        this.packageUnitType = packageUnitType;
        this.packageUnitVolumeInMilliliters = packageUnitVolumeInMilliliters;
        this.totalPackageUnits = totalPackageUnits;
        this.volumeInMilliliters = volumeInMilliliters;
        this.alcoholContent = alcoholContent;
        this.pricePerLiterOfAlcoholInCents = pricePerLiterOfAlcoholInCents;
        this.pricePerLiterInCents = pricePerLiterInCents;
        this.inventoryCount = inventoryCount;
        this.inventoryVolumeInMilliliters = inventoryVolumeInMilliliters;
        this.inventoryPriceInCents = inventoryPriceInCents;
        this.sugarContent = sugarContent;
        this.producerName = producerName;
        this.releasedOn = releasedOn;
        this.hasValueAddedPromotion = hasValueAddedPromotion;
        this.hasLimitedTimeOffer = hasLimitedTimeOffer;
        this.hasBonusRewardMiles = hasBonusRewardMiles;
        this.isSeasonal = isSeasonal;
        this.isVqa = isVqa;
        this.isOcb = isOcb;
        this.isKosher = isKosher;
        this.valueAddedPromotionDescription = valueAddedPromotionDescription;
        this.description = description;
        this.survingSuggestion = survingSuggestion;
        this.tastingNote = tastingNote;
        this.updatedAt = updatedAt;
        this.imageThumbUrl = imageThumbUrl;
        this.imageUrl = imageUrl;
        this.varietal = varietal;
        this.style = style;
        this.tertiaryCategory = tertiaryCategory;
        this.sugarInGramsPerLiter = sugarInGramsPerLiter;
        this.clearanceSaleSavingInCents = clearanceSaleSavingInCents;
        this.hasClearanceSale = hasClearanceSale;
        this.productNo = productNo;
    }

    public int getId() {
        return id;
    }

    public boolean isDead() {
        return isDead;
    }

    public String getName() {
        return name;
    }

    public String getTags() {
        return tags;
    }

    public boolean isDiscontinued() {
        return isDiscontinued;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    public int getRegularPriceInCents() {
        return regularPriceInCents;
    }

    public int getLimitedTimeOfferSavingsInCents() {
        return limitedTimeOfferSavingsInCents;
    }

    public String getLimitedTimeOfferEndsOn() {
        return limitedTimeOfferEndsOn;
    }

    public int getBonusRewardMiles() {
        return bonusRewardMiles;
    }

    public String getBonusRewardMilesEndsOn() {
        return bonusRewardMilesEndsOn;
    }

    public String getStockType() {
        return stockType;
    }

    public String getPrimaryCategory() {
        return primaryCategory;
    }

    public String getSecondaryCategory() {
        return secondaryCategory;
    }

    public String getOrigin() {
        return origin;
    }

    public String getPackageType() {
        return packageType;
    }

    public String getPackageUnitType() {
        return packageUnitType;
    }

    public int getPackageUnitVolumeInMilliliters() {
        return packageUnitVolumeInMilliliters;
    }

    public int getTotalPackageUnits() {
        return totalPackageUnits;
    }

    public int getVolumeInMilliliters() {
        return volumeInMilliliters;
    }

    public int getAlcoholContent() {
        return alcoholContent;
    }

    public int getPricePerLiterOfAlcoholInCents() {
        return pricePerLiterOfAlcoholInCents;
    }

    public int getPricePerLiterInCents() {
        return pricePerLiterInCents;
    }

    public int getInventoryCount() {
        return inventoryCount;
    }

    public int getInventoryVolumeInMilliliters() {
        return inventoryVolumeInMilliliters;
    }

    public int getInventoryPriceInCents() {
        return inventoryPriceInCents;
    }

    public String getSugarContent() {
        return sugarContent;
    }

    public String getProducerName() {
        return producerName;
    }

    public String getReleasedOn() {
        return releasedOn;
    }

    public boolean isHasValueAddedPromotion() {
        return hasValueAddedPromotion;
    }

    public boolean isHasLimitedTimeOffer() {
        return hasLimitedTimeOffer;
    }

    public boolean isHasBonusRewardMiles() {
        return hasBonusRewardMiles;
    }

    public boolean isSeasonal() {
        return isSeasonal;
    }

    public boolean isVqa() {
        return isVqa;
    }

    public boolean isOcb() {
        return isOcb;
    }

    public boolean isKosher() {
        return isKosher;
    }

    public String getValueAddedPromotionDescription() {
        return valueAddedPromotionDescription;
    }

    public String getDescription() {
        return description;
    }

    public String getSurvingSuggestion() {
        return survingSuggestion;
    }

    public String getTastingNote() {
        return tastingNote;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getImageThumbUrl() {
        return imageThumbUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getVarietal() {
        return varietal;
    }

    public String getStyle() {
        return style;
    }

    public String getTertiaryCategory() {
        return tertiaryCategory;
    }

    public int getSugarInGramsPerLiter() {
        return sugarInGramsPerLiter;
    }

    public int getClearanceSaleSavingInCents() {
        return clearanceSaleSavingInCents;
    }

    public boolean isHasClearanceSale() {
        return hasClearanceSale;
    }

    public int getProductNo() {
        return productNo;
    }
}
