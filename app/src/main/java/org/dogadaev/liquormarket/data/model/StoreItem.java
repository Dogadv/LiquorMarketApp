package org.dogadaev.liquormarket.data.model;

import com.google.gson.annotations.SerializedName;

public class StoreItem {

    @SerializedName("id")
    private final int id;

    @SerializedName("is_dead")
    private final boolean isDead;

    @SerializedName("name")
    private final String name;

    @SerializedName("tags")
    private final String tags;

    @SerializedName("address_line_1")
    private final String addressLine1;

    @SerializedName("address_line_2")
    private final String addressLine2;

    @SerializedName("city")
    private final String city;

    @SerializedName("postal_code")
    private final String postalCode;

    @SerializedName("telephone")
    private final String telephone;

    @SerializedName("fax")
    private final String fax;

    @SerializedName("latitude")
    private final float latitude;

    @SerializedName("longitude")
    private final float longtitude;

    @SerializedName("products_count")
    private final int productCount;

    @SerializedName("inventory_count")
    private final int inventoryCount;

    @SerializedName("inventory_price_in_cents")
    private final int inventoryPriceInCents;

    @SerializedName("inventory_volume_in_milliliters")
    private final int inventoryVolumeInMilliliters;

    @SerializedName("has_wheelchair_accessability")
    private final boolean hasWheelchairAccessability;

    @SerializedName("has_bilingual_services")
    private final boolean hasBilingualServices;

    @SerializedName("has_product_consultant")
    private final boolean hasProductConsultant;

    @SerializedName("has_tasting_bar")
    private final boolean hasTestingbar;

    @SerializedName("has_beer_cold_room")
    private final boolean hasBeerColdRoom;

    @SerializedName("has_special_occasion_permits")
    private final boolean hasSpecialOcassionPermits;

    @SerializedName("has_vintages_corner")
    private final boolean hasVintagesCorner;

    @SerializedName("has_parking")
    private final boolean hasParking;

    @SerializedName("has_transit_access")
    private final boolean hasTrnsitAccess;

    @SerializedName("sunday_open")
    private final int sundayOpen;

    @SerializedName("sunday_close")
    private final int sundayClose;

    @SerializedName("monday_open")
    private final int mondayOpen;

    @SerializedName("monday_close")
    private final int mondayClose;

    @SerializedName("tuesday_open")
    private final int tuesdayOpen;

    @SerializedName("tuesday_close")
    private final int tuesdayClose;

    @SerializedName("wednesday_open")
    private final int wednesdayOpen;

    @SerializedName("wednesday_close")
    private final int wednesdayClose;

    @SerializedName("thursday_open")
    private final int thursdayOpen;

    @SerializedName("thursday_close")
    private final int thursdayClose;

    @SerializedName("friday_open")
    private final int fridayOpen;

    @SerializedName("friday_close")
    private final int fridayClose;

    @SerializedName("saturday_open")
    private final int saturdayOpen;

    @SerializedName("saturday_close")
    private final int saturdayClose;

    @SerializedName("updated_at")
    private final String updatedAt;

    @SerializedName("store_no")
    private final int storeNo;

    StoreItem(int id, boolean isDead, String name, String tags, String addressLine1, String addressLine2, String city, String postalCode, String telephone, String fax, float latitude, float longtitude, int productCount, int inventoryCount, int inventoryPriceInCents, int inventoryVolumeInMilliliters, boolean hasWheelchairAccessability, boolean hasBilingualServices, boolean hasProductConsultant, boolean hasTestingbar, boolean hasBeerColdRoom, boolean hasSpecialOcassionPermits, boolean hasVintagesCorner, boolean hasParking, boolean hasTrnsitAccess, int sundayOpen, int sundayClose, int mondayOpen, int mondayClose, int tuesdayOpen, int tuesdayClose, int wednesdayOpen, int wednesdayClose, int thursdayOpen, int thursdayClose, int fridayOpen, int fridayClose, int saturdayOpen, int saturdayClose, String updatedAt, int storeNo) {
        this.id = id;
        this.isDead = isDead;
        this.name = name;
        this.tags = tags;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.postalCode = postalCode;
        this.telephone = telephone;
        this.fax = fax;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.productCount = productCount;
        this.inventoryCount = inventoryCount;
        this.inventoryPriceInCents = inventoryPriceInCents;
        this.inventoryVolumeInMilliliters = inventoryVolumeInMilliliters;
        this.hasWheelchairAccessability = hasWheelchairAccessability;
        this.hasBilingualServices = hasBilingualServices;
        this.hasProductConsultant = hasProductConsultant;
        this.hasTestingbar = hasTestingbar;
        this.hasBeerColdRoom = hasBeerColdRoom;
        this.hasSpecialOcassionPermits = hasSpecialOcassionPermits;
        this.hasVintagesCorner = hasVintagesCorner;
        this.hasParking = hasParking;
        this.hasTrnsitAccess = hasTrnsitAccess;
        this.sundayOpen = sundayOpen;
        this.sundayClose = sundayClose;
        this.mondayOpen = mondayOpen;
        this.mondayClose = mondayClose;
        this.tuesdayOpen = tuesdayOpen;
        this.tuesdayClose = tuesdayClose;
        this.wednesdayOpen = wednesdayOpen;
        this.wednesdayClose = wednesdayClose;
        this.thursdayOpen = thursdayOpen;
        this.thursdayClose = thursdayClose;
        this.fridayOpen = fridayOpen;
        this.fridayClose = fridayClose;
        this.saturdayOpen = saturdayOpen;
        this.saturdayClose = saturdayClose;
        this.updatedAt = updatedAt;
        this.storeNo = storeNo;
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

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getFax() {
        return fax;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongtitude() {
        return longtitude;
    }

    public int getProductCount() {
        return productCount;
    }

    public int getInventoryCount() {
        return inventoryCount;
    }

    public int getInventoryPriceInCents() {
        return inventoryPriceInCents;
    }

    public int getInventoryVolumeInMilliliters() {
        return inventoryVolumeInMilliliters;
    }

    public boolean isHasWheelchairAccessability() {
        return hasWheelchairAccessability;
    }

    public boolean isHasBilingualServices() {
        return hasBilingualServices;
    }

    public boolean isHasProductConsultant() {
        return hasProductConsultant;
    }

    public boolean isHasTestingbar() {
        return hasTestingbar;
    }

    public boolean isHasBeerColdRoom() {
        return hasBeerColdRoom;
    }

    public boolean isHasSpecialOcassionPermits() {
        return hasSpecialOcassionPermits;
    }

    public boolean isHasVintagesCorner() {
        return hasVintagesCorner;
    }

    public boolean isHasParking() {
        return hasParking;
    }

    public boolean isHasTrnsitAccess() {
        return hasTrnsitAccess;
    }

    public int getSundayOpen() {
        return sundayOpen;
    }

    public int getSundayClose() {
        return sundayClose;
    }

    public int getMondayOpen() {
        return mondayOpen;
    }

    public int getMondayClose() {
        return mondayClose;
    }

    public int getTuesdayOpen() {
        return tuesdayOpen;
    }

    public int getTuesdayClose() {
        return tuesdayClose;
    }

    public int getWednesdayOpen() {
        return wednesdayOpen;
    }

    public int getWednesdayClose() {
        return wednesdayClose;
    }

    public int getThursdayOpen() {
        return thursdayOpen;
    }

    public int getThursdayClose() {
        return thursdayClose;
    }

    public int getFridayOpen() {
        return fridayOpen;
    }

    public int getFridayClose() {
        return fridayClose;
    }

    public int getSaturdayOpen() {
        return saturdayOpen;
    }

    public int getSaturdayClose() {
        return saturdayClose;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public int getStoreNo() {
        return storeNo;
    }
}
