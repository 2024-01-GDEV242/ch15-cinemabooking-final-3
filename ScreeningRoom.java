import java.util.Arrays;
import java.util.Iterator;


/**
 * Write a description of class ScreeningRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScreeningRoom extends Showtime
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class ScreeningRoom
     */
    public ScreeningRoom()
    {
        // initialise instance variables
        int[] rowLength = {
            5, 9, 13,
            13, 13, 13,
        };
    }

    /**
     * this info is the array in x and y where the first array gives us the 
     * length of the room the second gives up the depth of the room
     */
    public Arrays seats()
    {
        // Draw first array
       int [][] seats = new int[10][];
       for (int i=0; i<10; i++)
           seats[i] = new int[7];
        System.out.println(seats.length);
        System.out.println(seats[0].length);
        System.out.println("This seat is unavailable");
            return null;
        }
}  