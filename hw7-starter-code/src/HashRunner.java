/**
 * This program experiments with the String hashing function
 * and distributes 5757 5-letter words into 5749 buckets.
 * Stats are collected and displayed.
 * 
 * @author Melissa Huynh
 * @version November 11, 2019
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HashRunner
{
    public static final int SIZE = 5749;
    public static void main(String[] args)
    {

        int[] x = new int[SIZE];

        try
        {
            File words = new File("sgb-words.txt");
            Scanner in = new Scanner(words);

            // TODO: Complete program . . .
            while(in.hasNext())
            {
            	int word = in.next().hashCode();
            	if(word < 0)
            			word = -1 * word;
            	word = word % 5729;
            	x[word] += 1;
            }
            int sumOfChains = 0;
            int numOfEmpty = 0;
            int longestChain = 0;
            
            for(int i = 0; i < SIZE; i++)
            {
            	if(x[i] == 0)
            		numOfEmpty++;
            	else
            		sumOfChains += x[i];
            	
            	if(x[i]>longestChain)
            		longestChain = x[i];
            }
            int averageChainLength = sumOfChains/(SIZE-numOfEmpty);
            
            System.out.println("The number of empty buckets is " + numOfEmpty/*here*/);
            System.out.println("The longest chain in a bucket is " + longestChain/*here*/);
            System.out.println("The average length of a chain is " + averageChainLength/*here*/);
            in.close();   
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
    }
}
