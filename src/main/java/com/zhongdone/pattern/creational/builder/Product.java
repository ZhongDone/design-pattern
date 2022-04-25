package com.zhongdone.pattern.creational.builder;

/**
 * 产品类
 */
public class Product {
    /**产品名称*/
    private String name;
    /**产品类型*/
    private String type;
    /**产品详细信息*/
    private String detail;
    /**产品图片地址*/
    private String imgUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", detail='" + detail + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
