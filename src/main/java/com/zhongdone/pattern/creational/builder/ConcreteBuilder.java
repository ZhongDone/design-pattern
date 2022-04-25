package com.zhongdone.pattern.creational.builder;

/**
 * 建造者
 */
public class ConcreteBuilder {

    private Product product = new Product();

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ConcreteBuilder addName(String name){
        this.product.setName(name);
        return this;
    }

    public ConcreteBuilder addType(String type) {
        this.product.setType(type);
        return this;
    }

    public ConcreteBuilder addDetail(String detail) {
        this.product.setDetail(detail);
        return this;
    }

    public ConcreteBuilder addImgUrl(String imgUrl) {
        this.product.setImgUrl(imgUrl);
        return this;
    }

}
