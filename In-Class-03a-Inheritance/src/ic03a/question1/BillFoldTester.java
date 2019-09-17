package ic03a.question1;

public class BillFoldTester extends BillFold
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        DriverLicense d = new DriverLicense("Bob B.", 2019);
        callingCard c = new callingCard("Other Card", 209, 1);
        
        BillFold wallet = new BillFold();
        
        wallet.addCard(d);
        wallet.addCard(c);
        
        IDCard John = new IDCard("John",123);
        
        System.out.println(John.toString());
        
        System.out.println(wallet.formatCards());
    }

}