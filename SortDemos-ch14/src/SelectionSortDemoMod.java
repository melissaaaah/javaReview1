import java.util.Arrays;

/**
   This program demonstrates the selection sort algorithm by
   sorting an array that is filled with random numbers.
 */
public class SelectionSortDemoMod
{  
    public static void main(String[] args)
    {  
        
    	 int[] a = ArrayUtil.randomIntArray(10000, 10000);
         
         
         SelectionSorter.sort(a);

         System.out.println(a.length + " Random elements. Comparisons made: " + SelectionSorter.getcCount());
         System.out.println("Swaps made: " + SelectionSorter.cSwap);
         
         System.out.println();
         
         
     	// Construct sorted array
     	
     	int[] b = new int[10000];
         for(int i = 0; i < b.length; i++)
         {
         	b[i] = i;
         }
         
         SelectionSorter.resetcCount();
         SelectionSorter.resetcSwap();
         SelectionSorter.sort(b);
         
         System.out.println(b.length + " Sorted elements. Comparisons made: " + SelectionSorter.getcCount());
         System.out.println("Swaps made: " + SelectionSorter.getcSwap());
         
         System.out.println();
         
         //Reverse sorted array
         int[] c = new int[10000];
         for(int i = 0; i < c.length; i++)
         {
         	
         	c[i] = c.length - i;
         }
        
         SelectionSorter.resetcCount();
         SelectionSorter.resetcSwap();
         SelectionSorter.sort(c);
         
         System.out.println(c.length + " Reverse elements. Comparisons made: " + SelectionSorter.getcCount());
         System.out.println("Swaps made: " + SelectionSorter.getcSwap());
    }
}