package ru.netology.domain.attachment;

public class Sticker {
    private int productId;
    private int stickerId;
    private Images[] image;
    private ImagesWithBackground[] element;


    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }


    public int getStickerId() {
        return stickerId;
    }
    public void setStickerId(int stickerId) {
        this.stickerId = stickerId;
    }


    public Images[] getImage() {
        return image;
    }
    public void setImage(Images[] image) {
        this.image = image;
    }


    public ImagesWithBackground[] getElement() {
        return element;
    }
    public void setElement(ImagesWithBackground[] element) {
        this.element = element;
    }
}
