package com.project.hello;

public class ProductDetails {
        private String pageName;
        private String pageTitle;
        private String metaDescription;
        private int offerPriceMax;
        private String clientRating;
        private String ratingCount;
        private String category;
        private String subCategory;
        private String neckType;

        private SizeChart sizeChart;

        public ProductDetails() {

        }

    public void setRatingCount(String ratingCount) {
        this.ratingCount = ratingCount;
    }

    public String getRatingCount() {
        return ratingCount;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setOfferPriceMax(int offerPriceMax) {
        this.offerPriceMax = offerPriceMax;
    }

    public int getOfferPriceMax() {
        return offerPriceMax;
    }

    public void setClientRating(String clientRating) {
        this.clientRating = clientRating;
    }

    public String getClientRating() {
        return clientRating;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setNeckType(String neckType) {
        this.neckType = neckType;
    }

    public String getNeckType() {
        return neckType;
    }


}
