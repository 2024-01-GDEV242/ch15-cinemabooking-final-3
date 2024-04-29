import java.util.ArrayList;
import java.util.Arrays;

/**
 * Write a description of class ScreenTicket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScreenTicket {
    // Instance variable
    private ArrayList<String> reservedSeats; // List of reserved seats

    /**
     * Constructor for objects of class ScreenTicket.
     * 
     */
    
    public ScreenTicket(String[] seats) {
        this.reservedSeats = new ArrayList<>(Arrays.asList(seats)); 
    }

    /**
     * Adds additional seats to the reservation.
     * 
     */
    public void addSeats(String[] additionalSeats) {
        reservedSeats.addAll(Arrays.asList(additionalSeats)); // Add seats to the ArrayList
    }

    /**
     * Removes specified seats from the reservation.
     * 
     */
    public void removeSeats(String[] removedSeats) {
        reservedSeats.removeAll(Arrays.asList(removedSeats)); // Remove seats from the ArrayList
    }

    /**
     * Get the list of reserved seats.
     * 
     */
    public ArrayList<String> getReservedSeats() {
        return reservedSeats;
    }
}
