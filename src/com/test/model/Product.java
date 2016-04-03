package com.test.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by salonivithalani on 4/3/16.
 */
@XmlRootElement(name = "ProductClass", namespace = "PC")
@XmlType(propOrder = {"price", "sku", "name"})
public class Product {
    private String name;
    private String sku;
    private double price;

    public Product(){}

    @XmlElement(name = "product_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Product(String name, String sku, double price) {
        this.name = name;
        this.sku = sku;
        this.price = price;
    }
}
