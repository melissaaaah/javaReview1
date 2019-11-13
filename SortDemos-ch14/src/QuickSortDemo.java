import java.util.Arrays;

/**
   This program demonstrates the quick sort algorithm by
   sorting an array that is filled with random numbers.
 */
public class QuickSortDemo
{  
    public static void main(String[] args)
    {  
    	int[] a = ArrayUtil.randomIntArray(10000, 10000);
        
        
        QuickSorter.sort(a);

        System.out.println(a.length + " Random elements. Comparisons made: " + QuickSorter.getcCount());
        System.out.println("Swaps made: " + QuickSorter.cSwap);
        
        System.out.println();
        
        
    	// Construct sorted array
    	
    	int[] b = new int[10000];
        for(int i = 0; i < b.length; i++)
        {
        	b[i] = i;
        }
        
        QuickSorter.resetcCount();
        QuickSorter.resetcSwap();
        QuickSorter.sort(b);
        
        System.out.println(b.length + " Sorted elements. Comparisons made: " + QuickSorter.getcCount());
        System.out.println("Swaps made: " + QuickSorter.getcSwap());
        
        System.out.println();
        
        //Reverse sorted array
        int[] c = new int[10000];
        for(int i = 0; i < c.length; i++)
        {
        	
        	c[i] = c.length - i;
        }
       
        QuickSorter.resetcCount();
        QuickSorter.resetcSwap();
        QuickSorter.sort(c);
        
        System.out.println(c.length + " Reverse elements. Comparisons made: " + QuickSorter.getcCount());
        System.out.println("Swaps made: " + QuickSorter.getcSwap());
    }
}