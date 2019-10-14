import java.util.Scanner;

/**
   This program measures how long it takes to sort an
   array of a user-specified size with the selection
   sort algorithm.
 */
public class SelectionSortTimer
{  
    public static void main(String[] args)
    {  
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = in.nextInt();
        */
          // Construct random array
        
        for(int n = 1; n <= 9 ; n++)
        {
            int[] a = ArrayUtil.randomIntArray(n*10000, 10000);

        // Use stopwatch to time selection sort

        StopWatch timer = new StopWatch();

        timer.start();
        SelectionSorter.sort(a);
        timer.stop();

        System.out.println("Elapsed time: " 
                + timer.getElapsedTime() + " milliseconds");
        }
        
    }
}


