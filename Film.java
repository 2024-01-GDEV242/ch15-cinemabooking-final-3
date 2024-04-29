
/**
 * Write a description of class Film here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Film extends ScreeningRoom
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Film
     */
    public Film()
    {
        // display amount of films present
        System.out.println("The Current Amount of Movies Present Are: ");
        System.out.println("5");
        // amount may be random, but using 5 as an example
        // displays amount of theaters present
        System.out.println("The Current Amount of Theaters Present Are: ");
        System.out.println("10");
        System.out.println("For each movie, two theaters are showing them.");
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
