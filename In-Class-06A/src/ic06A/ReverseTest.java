package ic06A;

public class ReverseTest
{
    /*
     * Recursive version
     */
    public static String reverse(String text)
    {
        if(text.length() <= 1)
            return text;
        
        char first = text.charAt(0);
        return reverse(text.substring(1)) + first; // reverse of rest + first char.
    }
    /*
     * Using recursive helper
     */
    public static String reverse2(String text)
    {
        // will call helper reverse(String,int,int) below
        return reverse(text, 0, text.length() - 1);
    }
    
    /*Recursive helper function for reverse 2
     * 
     */
    public static String reverse(String text, int start, int end)
    {
        if(start > end)
            return ""; 
        if(start == end)
            return "" + text.charAt(start);
        
        char first = text.charAt(start);
        char last = text.charAt(end);
        return last + reverse(text, start + 1 , end - 1) + first;
    }
    
    /*
     * Iterative version
     */
    public static String reverse3(String text)
    {
        String ans = "";
        for(int i = text.length()-1; i >= 0; --i)
            ans += text.charAt(i);
        return ans;
    }
    
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String[] tests = {"Hello!", "Orange Coast College", "go", "x"};
        for (String s: tests)
        {
            System.out.println(s + " <---- original string");
            System.out.println(reverse(s) + " <---- recursive");
            System.out.println(reverse2(s) + " <---- recursive helper");
            System.out.println(reverse3(s) +  " <--- iterative");
        }
        
    }

}
