package interfaces;

import java.io.IOException;
import java.text.ParseException;
import utils.FlightWebSpiderResponse;

/**
 *
 * @author Halil
 */
public interface InterfaceFlightWebSpider {

    public abstract void connect() throws IOException, NullPointerException, ParseException;

    public abstract void connect(String user, String password) throws IOException, NullPointerException, ParseException;

    public abstract FlightWebSpiderResponse search(
            String from,
            String to,
            String departDate,
            String returnDate,
            Integer tripType,
            Integer adult,
            Integer child,
            Integer infant) throws IOException, NullPointerException, ParseException;

    public abstract void disconnect();
}
