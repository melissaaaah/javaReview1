import java.util.Scanner;

/**
 * This program prints trace messages that show how often the recursive method
 * for computing Fibonacci numbers calls itself. Every recursive call causes
 * further indentation of the trace messages.
 */
public class RecursiveFibTracer2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();

        long f = fib(n);

        System.out.println("fib(" + n + ") = " + f);
    }

    /**
     * Computes a Fibonacci number.
     * 
     * @param n an integer
     * @return the nth Fibonacci number
     */
    public static long fib(int n)
    {
        String tabstop = "";
        for (int i = 0; i < depth; ++i) tabstop += " ";
        System.out.println(tabstop + "Entering fib: n = " + n);
        depth++;
        long f;
        if (n <= 2) { f = 1; }
        else { f = fib(n - 1) + fib(n - 2); }
        depth--;
        System.out.println(tabstop + "Exiting fib: n = " + n + " return value = " + f);
        return f;
    }

    public static int depth = 0;
}
