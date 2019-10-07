import java.util.Arrays;

/**
   This program demonstrates the selection sort algorithm by
   sorting an array that is filled with random numbers.
 */
public class SelectionSortDemoMod
{  
    public static void main(String[] args)
    {  
        for (int size = 1; size <= 6; ++size)
             {
                  int[] a = ArrayUtil.randomIntArray(size*1000, size*1000);
                 
                  
                  SelectionSorter.resetcCount();
                  
                  SelectionSorter.sort(a);
                  
                  System.out.println(a.length + "elements. Comparisons made: " + SelectionSorter.getcCount());
              }
    }
}
/*
 * 
 * Scanner in = new Scanner(System.in);
 * system.out.println("enter array size");
 * int n = in.nextInt();
 * 
 * 
 * for(int size = 1; size <= 6; ++size)
 * {
 *      int[] a = ArrayUtil.randomIntArray(size*1000, size*1000);
 *      
 *      
 *      SelectionSorter.resetcCount();
 *      
 *      SelectionSorter.sort(a);
 *      
 *      System.out.println(a.length + "elements. Comparisons made: " + SelectionSorter.getcCount());
 */


