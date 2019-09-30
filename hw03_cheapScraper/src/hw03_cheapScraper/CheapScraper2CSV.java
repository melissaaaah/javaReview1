package hw03_cheapScraper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CheapScraper2CSV
{

    public static void main(String[] args) throws IOException
    {
        // TODO Auto-generated method stub
        try {
			System.out.println("Command line args: ");
			
			/*
			for(int i = 0; i< args.length; ++i)
			{
			    System.out.println(args[i]);
			}
			*/
			
			/*
			int columns = Integer.parseInt(args[0]);
			String inputFileName = args[1];
			String outputFileName = args[2];
			*/
			for(int i = 0; i< args.length; ++i)
			{
			    System.out.println(args[i]);
			}
			int columns = Integer.parseInt(args[0]);
			
			FileReader fr = new FileReader(args[1]);
			FileWriter fw = new FileWriter(args[2]);
 
			Scanner in = new Scanner(fr);
			StringBuilder sb = new StringBuilder();
			int count = 0;
			while(in.hasNextLine())
			{
				String line = in.nextLine();
				
				if(line.contains(","))
					sb.append("\"" + line + "\"");
				else
					sb.append(line);
				
				sb.append(",");
				count++;
				
				if(count%4 == 0)
					sb.append("\n");
			}
			
			fw.write(sb.toString());
			fw.close();
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.err.println("Please enter the correct data type");
		} catch (FileNotFoundException e)
        {
			System.err.println("File not found");
        }
        
        
        
    }

}
