package ru.netology.domain.attachment;

public class Cards {
    private String cartId;
    private String linkUrl;
    private String title;
    private Images[] image;
    private String price;
    private String priceOld;


    public String getCartId() {
        return cartId;
    }
    public void setCartId(String cartId) {
        this.cartId = cartId;
    }


    public String getLinkUrl() {
        return linkUrl;
    }
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }


    public Images[] getImage() {
        return image;
    }
    public void setImage(Images[] image) {
        this.image = image;
    }


    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }


    public String getPriceOld() {
        return priceOld;
    }
    public void setPriceOld(String priceOld) {
        this.priceOld = priceOld;
    }

}
