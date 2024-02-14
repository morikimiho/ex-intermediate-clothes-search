package com.example.exintermediatesearchclothes.model;

public class Clothes {
    /** ID */
    private String id;
    /** 商品カテゴリ */
    private String category;
    /** 商品ジャンル */
    private String genre;
    /** 性別 */
    private Integer gender;
    /** 色 */
    private String color;
    /** 価格 */
    private Integer price;
    /** サイズ */
    private String size;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public Integer getGender() {
        return gender;
    }
    public void setGender(Integer gender) {
        this.gender = gender;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    @Override
    public String toString() {
        return "Clothes [id=" + id + ", category=" + category + ", genre=" + genre + ", gender=" + gender + ", color="
                + color + ", price=" + price + ", size=" + size + "]";
    }
}