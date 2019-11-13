/**
   The sort method of this class sorts an array, using the selection 
   sort algorithm.
 */
public class SelectionSorter
{
    public static long cCount = 0;
    public static long cSwap = 0;
    public static void resetcCount() { cCount = 0; }
    public static void resetcSwap() { cSwap = 0; } 
    public static void cSwapInc() { cSwap++; } 
    public static void cCountInc() { cCount++; }
    public static long getcSwap() { return cSwap; }
    public static long getcCount() { return cCount; }
    /**
      Sorts an array, using selection sort.
      @param a the array to sort
     */
    public static void sort(int[] a)
    {  
        for (int i = 0; i < a.length - 1; i++)
        {  
            int minPos = minimumPosition(a, i);
            ArrayUtil.swap(a, minPos, i);
        }
    }

    /**
      Finds the smallest element in a tail range of the array.
      @param a the array to sort
      @param from the first position in a to compare
      @return the position of the smallest element in the
      range a[from] . . . a[a.length - 1]
     */
    private static int minimumPosition(int[] a, int from)
    {  
        int minPos = from;
        for (int i = from + 1; i < a.length; i++)
        {
        	cCount++;
            if (a[i] < a[minPos]) { minPos = i; cSwap++;  }
        }
        return minPos;
    }
}
