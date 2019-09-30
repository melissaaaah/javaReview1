package ic06A;

public class ReverseTest
{
    /*
     * Recursive version
     */
    public static String reverse(String text)
    {
        return text;
    }
    /*
     * Using recursive helper
     */
    public static String reverse2(String text)
    {
        // will call helper reverse(String,int,int) below
        return text;
    }
    /*Recursive helper function for reverse 2
     * 
     */
    public static String reverse(String text, int start, int end)
    {
        return text;
    }
    
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String[] tests = {"Hello!", "Orange Coast College", "go", "x"};
        for (String s: tests)
        {
            System.out.println(reverse(s) + " <---- recursive");
            System.out.println(reverse2(s) + " <-- recursive helper");
            System.out.println(reverse3(s) +  " <--- iterative");
        }
        
    }

}
