import java.util.HashMap;
import java.util.Map;
/**
 * The Reserve class will handle making, updating, and canceling 
 * reservations for screenings and seats.
 * So it is holding information about the seat availability 
 * as well as ticket availability 
 * @author Eli
 * @version 2024.04.29
 */
public class Reserve extends Alert {
    // instance variables to store reservations for screenings
    private HashMap<String, ScreenTicket> reservations;

    /**
     * Constructor for objects of class Reserve
     */
    public Reserve() {
        // Initialize the reservations map
        reservations = new HashMap<>();
    }

    /**
     * Make a reservation for a screening with specified seats
     * ScreeningID makes it possible to know which viewing room
     * the arrangements for tickets and seating are for 
     */
    public void makeReservation(String screeningId, String[] seats) {
        // Create a new ScreenTicket for the screening and seats
        ScreenTicket ticket = new ScreenTicket(seats);
        
        // Add the reservation to the map
        reservations.put(screeningId, ticket);
    }

    /**
     * Update an existing reservation by adding or removing seats
     * 
     */
    public void updateReservation(String screeningId, String[] additionalSeats, String[] removedSeats) {
        // Get the ScreenTicket for the specified screening
        ScreenTicket ticket = reservations.get(screeningId);  
        // If the ticket exists, update the reservation
        if (ticket != null) {
            ticket.addSeats(additionalSeats); // Add additional seats
            ticket.removeSeats(removedSeats); // Remove specified seats
        }
    }

    /**
     * Give the user the ability to cancel a 
     * reservation for a screening
     * @param screeningId the ID of the screening
     */
    public void cancelReservation(String screeningId) {
        // Remove the reservation for the specified screening
        reservations.remove(screeningId); 
    }
}

