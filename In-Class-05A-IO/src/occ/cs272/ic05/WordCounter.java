package occ.cs272.ic05;

import java.io.FileReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Scanner;

/**
 * Reading and processing text files.
 * 
 * Reads a text file, line by line, counts the number of words per line, prints
 * out each line of the poem, preceded by number of the number of words in that
 * line.
 * 
 */
public class WordCounter
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "mhuynh76";
    public static final String ASSIGNMENT = "IC05-B";
    
    /**
     * void countWords()
     * @param in the Reader to get the bytes from
     * @param out the Writer to send the results to
     */
    public void countWords(Reader reader, Writer writer) 
    {
        // 1. Construct the Scanner and PrintWriter objects
        // TODO: your work here
        Scanner in = new Scanner(reader);
        PrintWriter out = new PrintWriter(writer);
        // 2. Read the input file, writing the output for each line
        // TODO: your work here
        while(in.hasNextLine())
        {
            String line = in.nextLine();
            
            int count= 0;
            Scanner inLine = new Scanner(line);
            while(inLine.hasNext())
            {
                String dummy = inLine.next();
                count++;
            }
            inLine.close();
            out.printf("%-3d " + line + "\n", count);
        }
        // 3. Close all files
        // TODO: your work here
        in.close();
        out.close();
    }

    /**
     * Run as an application like this.
     */
    public static void main(String[] args) throws Exception
    {
        WordCounter app = new WordCounter();
        // Set up the input and output file names (hard-coded for this problem)
        StringWriter out = new StringWriter();
        app.countWords(new FileReader("JackJill.txt"), out); 
        System.out.println(out.toString());
    }
}
