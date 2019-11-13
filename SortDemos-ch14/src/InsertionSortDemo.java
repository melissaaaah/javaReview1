import java.util.Arrays;

/**
   This program demonstrates the insertion sort algorithm.
 */
public class InsertionSortDemo
{  
    public static void main(String[] args)
    {  
    	 int[] a = ArrayUtil.randomIntArray(10000, 10000);
         
         
         InsertionSorter.sort(a);

         System.out.println(a.length + " Random elements. Comparisons made: " + InsertionSorter.getcCount());
         System.out.println("Swaps made: " + InsertionSorter.cSwap);
         
         System.out.println();
         
         
     	// Construct sorted array
     	
     	int[] b = new int[10000];
         for(int i = 0; i < b.length; i++)
         {
         	b[i] = i;
         }
         
         InsertionSorter.resetcCount();
         InsertionSorter.resetcSwap();
         InsertionSorter.sort(b);
         
         System.out.println(b.length + " Sorted elements. Comparisons made: " + InsertionSorter.getcCount());
         System.out.println("Swaps made: " + InsertionSorter.getcSwap());
         
         System.out.println();
         
         //Reverse sorted array
         int[] c = new int[10000];
         for(int i = 0; i < c.length; i++)
         {
         	
         	c[i] = c.length - i;
         }
         
         InsertionSorter.resetcCount();
         InsertionSorter.resetcSwap();
         InsertionSorter.sort(c);
         
         System.out.println(c.length + " Reverse elements. Comparisons made: " + InsertionSorter.getcCount());
         System.out.println("Swaps made: " + InsertionSorter.getcSwap());
    }
}
