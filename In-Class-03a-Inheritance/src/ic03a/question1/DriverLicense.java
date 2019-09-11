package ic03a.question1;

public class DriverLicense extends Card
{
    private int expYear;
    
    public DriverLicense(String n, int exp)
    {
        super(n);
        expYear = exp;
    }
    
    public String format()
    {
        return  super.format() + "\n Expiration Year: "
                + expYear;
    }
}
