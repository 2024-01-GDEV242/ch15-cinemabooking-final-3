import java.io.*;
import java.util.*;

/**
 * This class stores the film titles in a linked list that allows the user to determine what they want to see so long as the information of the title is associated to a value on the list
 *
 * @author Don "Ghengis_Don" Santiago
 * @version Alpha May 1st 2023
 */
public class FilmTitles extends Film
{
    // instance variables - replace the example below with your own
        
    private LinkedList<String>Films=new LinkedList<>();
    
    public FilmTitles() throws IOException
    {
        /**
         * addition of film titles to linked list
         */
        Films.add("Movie 1");
        Films.add("Movie 2");
        Films.add("Movie 3");
        Films.add("Movie 4");
        Films.add("Movie 5");
    
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String element;
        int position, choice=0;
    
    while (choice<6)
        {
        System.out.println("\n THE CURRENT MOVIE LIST IS AS FOLLOWS");
        System.out.println("1. Movie 1");
        System.out.println("2. Movie 2");
        System.out.println("3. Movie 3");
        System.out.println("4. Movie 4");
        System.out.println("5. Movie 5");
        System.out.println("6. Exit");
        
        System.out.println("Enter a numeric choice value");
        choice=Integer.parseInt(br.readLine());
        
        switch(choice)
            {
            case 1:
                System.out.println("You have selected to watch 'Movie 1'");
            
            case 2:
                System.out.println("You have selected to watch 'Movie 2'");
                
            case 3:
                System.out.println("You have selected to watch 'Movie 3'");
                
            case 4:
                System.out.println("You have selected to watch 'Movie 4'");
                
            case 5:
                System.out.println("You have selected to watch 'Movie 5'");
                
            case 6:
                System.out.println("You have selected to not watch any movie. ");
                System.exit(0);
                default:
                    return;
            }
        }
    }
}