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
public class Reserve extends Alert
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Reserve
     */
    public Reserve()
    {
        /**This map is created to hold information pertaining 
        * to reservations being held for tickets and seating
        */
       reservations = new HashMap<>();
    }
}

