package hw03_cheapScraper;

public class CheapScraper2CSV
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        System.out.println("Command line args: ");
        for(int i = 0; i< args.length; ++i)
        {
            System.out.println(args[i]);
        }
        
        int columns = Integer.parseInt(args[0]);
        String inputFileName = args[1];
        String outputFileName = args[2];
    }

}
