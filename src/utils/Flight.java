package utils;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Halil
 */
public class Flight {

    private String flightCode = "";
    private Date departurDate;
    private Date landingDate;
    private String flightOperator = "";
    private Route route;
    private List<FlightPrices> flightPrices;

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public Date getDeparturDate() {
        return departurDate;
    }

    public void setDeparturDate(Date departurDate) {
        this.departurDate = departurDate;
    }

    public Date getLandingDate() {
        return landingDate;
    }

    public void setLandingDate(Date landingDate) {
        this.landingDate = landingDate;
    }

    public String getFlightOperator() {
        return flightOperator;
    }

    public void setFlightOperator(String flightOperator) {
        this.flightOperator = flightOperator;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public List<FlightPrices> getFlightPrices() {
        return flightPrices;
    }

    public void setFlightPrices(List<FlightPrices> flightPrices) {
        this.flightPrices = flightPrices;
    }
    
}
