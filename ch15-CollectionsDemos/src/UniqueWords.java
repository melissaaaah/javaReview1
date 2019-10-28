import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * How many unique words in Alice in Wonderland?
 * Complete the program to find out.
 * 
 * @author 
 * @version 
 *
 */
public class UniqueWords
{
    public static void main(String[] args) throws FileNotFoundException
    {        
        Scanner in = new Scanner(new File("alice30.txt"));
        
        /* TODO: Get the appropriate data structure ready... */
        Set<String> set = new HashSet<String>();
        
        while (in.hasNext())
        {
            /* TODO: Read and process the next word... */
            String word = in.next().toLowerCase();
            set.add(word);
        }
        in.close();

        //System.out.println( /* TODO: Print the answer... */ );
        System.out.println("The number of unique words: ");
        System.out.println(set.size());
    }
}

