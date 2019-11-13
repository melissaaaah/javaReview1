import java.util.Arrays;

/**
   This program demonstrates the merge sort algorithm by
   sorting an array that is filled with random numbers.
 */
public class MergeSortDemo
{  
    public static void main(String[] args)
    {  
        int[] a = ArrayUtil.randomIntArray(10000, 10000);
        
        
        MergeSorter.sort(a);

        System.out.println(a.length + " Random elements. Comparisons made: " + MergeSorter.getcCount());
        System.out.println("Swaps made: " + MergeSorter.cSwap);
        
        System.out.println();
        
        
    	// Construct sorted array
    	
    	int[] b = new int[10000];
        for(int i = 0; i < b.length; i++)
        {
        	b[i] = i;
        }
        
        MergeSorter.resetcCount();
        MergeSorter.resetcSwap();
        MergeSorter.sort(b);
        
        System.out.println(b.length + " Sorted elements. Comparisons made: " + MergeSorter.getcCount());
        System.out.println("Swaps made: " + MergeSorter.getcSwap());
        
        System.out.println();
        
        //Reverse sorted array
        int[] c = new int[10000];
        for(int i = 0; i < c.length; i++)
        {
        	
        	c[i] = c.length - i;
        }
        
        MergeSorter.resetcCount();
        MergeSorter.resetcSwap();
        MergeSorter.sort(c);
        
        System.out.println(c.length + " Reverse elements. Comparisons made: " + MergeSorter.getcCount());
        System.out.println("Swaps made: " + MergeSorter.getcSwap());
    }
}

