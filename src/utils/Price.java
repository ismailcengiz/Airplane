/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Halil
 */
public class Price {

    private String priceCode = "";
    private String priceClass = "";
    private Double cost;
    private String currency;//int enum
    private DetailPrice detailPrice;

    public String getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(String priceCode) {
        this.priceCode = priceCode;
    }

    public String getPriceClass() {
        return priceClass;
    }

    public void setPriceClass(String priceClass) {
        this.priceClass = priceClass;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public DetailPrice getDetailPrice() {
        return detailPrice;
    }

    public void setDetailPrice(DetailPrice detailPrice) {
        this.detailPrice = detailPrice;
    }
    
    
}
