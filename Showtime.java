import java.util.HashMap;
import java.util.Map;
/**
 * Write a description of class Showtime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Showtime {
    private Map<String, Integer> availableSeats; // Map to store available seats for each theater

    public Showtime() {
        // Initialize available seats for each theater
        availableSeats = new HashMap<>();
        availableSeats.put("Theater 1", 100); // Assume 100 seats available initially
        availableSeats.put("Theater 2", 120);
        availableSeats.put("Theater 3", 90);
        // Add more theaters and their available seats as needed
    }

    // Method to reserve a seat in a specific theater
    public boolean reserveSeat(String theaterName) {
        if (availableSeats.containsKey(theaterName)) {
            int seatsAvailable = availableSeats.get(theaterName);
            if (seatsAvailable > 0) {
                availableSeats.put(theaterName, seatsAvailable - 1);
                System.out.println("Seat reserved successfully for " + theaterName);
                return true;
            } else {
                System.out.println("Sorry, no seats available for " + theaterName);
                return false;
            }
        } else {
            System.out.println("Invalid theater name: " + theaterName);
            return false;
        }
    }

    // Method to display available seats for each theater
    public void displayAvailableSeats() {
        System.out.println("Available seats for each theater:");
        for (Map.Entry<String, Integer> entry : availableSeats.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " seats available");
        }
    }
}

