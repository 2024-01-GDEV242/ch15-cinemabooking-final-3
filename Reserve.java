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
class Reserve {
    private HashMap<String, ScreenTicket> reservations; // Map to store reservations for screenings

    public Reserve() {
        // Initialize the reservations map
        reservations = new HashMap<>();
    }

    // Make a reservation for a screening with specified seats
    public void makeReservation(String screeningId, String[] seats) {
        // Create a new ScreenTicket for the screening and seats
        ScreenTicket ticket = new ScreenTicket(seats);
        
        // Add the reservation to the map
        reservations.put(screeningId, ticket);
    }

    // Update an existing reservation by adding or removing seats
    public void updateReservation(String screeningId, String[] additionalSeats, String[] removedSeats) {
        // Get the ScreenTicket for the specified screening
        ScreenTicket ticket = reservations.get(screeningId);  
        // If the ticket exists, update the reservation
        if (ticket != null) {
            ticket.addSeats(additionalSeats); // Add additional seats
            ticket.removeSeats(removedSeats); // Remove specified seats
        }
    }

    // Cancel a reservation for a screening
    public void cancelReservation(String screeningId) {
        // Remove the reservation for the specified screening
        reservations.remove(screeningId); 
    }
}

class ScreenTicket {
    private String[] seats;

    public ScreenTicket(String[] seats) {
        this.seats = seats;
    }

    public void addSeats(String[] additionalSeats) {
        // Add additional seats to the existing seats array
    }

    public void removeSeats(String[] removedSeats) {
        // Remove specified seats from the existing seats array
    }
}

