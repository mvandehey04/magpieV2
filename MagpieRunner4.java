
/**
 * A simple class to run the Magpie class.
 *
 * @author Madeline Vande Hey
 * @version 3/26/22
 */

import java.util.Scanner;

public class MagpieRunner4
{

    /**
     * Create a Magpie, give it user input, and print its replies.
     */
    public static void main(String[] args)
    {
        Magpie4 maggie = new Magpie4();

        System.out.println (maggie.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();

        while (!statement.toLowerCase().contains("bye")){
            System.out.println (maggie.getResponse(statement));
            statement = in.nextLine();
        }
    }

}
