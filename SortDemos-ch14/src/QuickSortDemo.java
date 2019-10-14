import java.util.Arrays;

/**
   This program demonstrates the quick sort algorithm by
   sorting an array that is filled with random numbers.
 */
public class QuickSortDemo
{  
    public static void main(String[] args)
    {  
        for(int size = 1 ; size <= 9; size++)
        {
        int[] a = ArrayUtil.randomIntArray(size*10000, size*10000);
        QuickSorter.resetcCount();

        QuickSorter.sort(a);

        System.out.println(a.length + " Elements. Comparisons made: " + QuickSorter.getcCount()
        + " Number of swaps: " + SelectionSorter.cSwap);
        }
    }
}