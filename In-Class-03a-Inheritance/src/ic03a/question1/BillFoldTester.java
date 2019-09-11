package ic03a.question1;

public class BillFoldTester
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        DriverLicense d = new DriverLicense("Bob B.", 2019);
        callingCard c = new callingCard("Other Card", 209, 1);
        d.format();
        
        BillFold b = new BillFold();
        
        System.out.println(b.formatCards());
    }

}
