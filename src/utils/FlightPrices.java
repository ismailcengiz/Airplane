package utils;

import java.util.List;

/**
 *
 * @author Halil
 */
public class FlightPrices {
    
    private String priceType = "";
    private List<Price> price;

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public List<Price> getPrice() {
        return price;
    }

    public void setPrice(List<Price> price) {
        this.price = price;
    }
}
