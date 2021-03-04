package com.santhosh.product.domain;

import java.util.Objects;

public class Product {

    private String productId;

    private String assortmentListType;

    private String barcodes;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getAssortmentListType() {
        return assortmentListType;
    }

    public void setAssortmentListType(String assortmentListType) {
        this.assortmentListType = assortmentListType;
    }

    public String getBarcodes() {
        return barcodes;
    }

    public void setBarcodes(String barcodes) {
        this.barcodes = barcodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productId, product.productId) &&
                Objects.equals(assortmentListType, product.assortmentListType) &&
                Objects.equals(barcodes, product.barcodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, assortmentListType, barcodes);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", assortmentListType='" + assortmentListType + '\'' +
                ", barcodes='" + barcodes + '\'' +
                '}';
    }
}
