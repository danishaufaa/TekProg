 /**
 * This program displays a greeting for for the reader
 * @version 1.1 2025-02-10
 * @author Muhammad Danish Aufa
 */
public class Welcome2 
{
    public static void main(String[] args)
    {
        String greeting = "Welcome to Core Java!";
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++)
            System.out.print("=");
        System.out.println();
    }

}
