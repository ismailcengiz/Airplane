package utils;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Halil
 */
public class FlightInformation {

    private List<Flight> flights = new ArrayList<>();
    private boolean isRedirect = false;
    private List<FlightPrices> totalPrice;

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public boolean isIsRedirect() {
        return isRedirect;
    }

    public void setIsRedirect(boolean isRedirect) {
        this.isRedirect = isRedirect;
    }

    public List<FlightPrices> getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(List<FlightPrices> totalPrice) {
        this.totalPrice = totalPrice;
    }
    
}
