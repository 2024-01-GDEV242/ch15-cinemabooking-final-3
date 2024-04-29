
/**
 * Projector determines if the movie showing will be in 3D or not.
 *
 * @author Eli
 * @version 2024.04.29
 */
public class Projector extends ScreeningRoom 
{
    // Variable to hold whether the movie will be in 3D or not
    private boolean is3D; 

    /**
     * Constructor for objects of class Projector
     */
    public Projector() {
        // Initialize is3D to false by default because movie will be standard
        is3D = false; 
    }

    /**
     * Set whether the movie will be in 3D or not
     * @param is3D true if the movie will be in 3D, false if it is not
     */
    public void set3D(boolean is3D) {
        this.is3D = is3D;
    }

    /**
     * Check if the movie will be in 3D
     * will return true if the movie will be in 3D, false if it is not
     */
    public boolean is3D() {
        return is3D;
    }
}
