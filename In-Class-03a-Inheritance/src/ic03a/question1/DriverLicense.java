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
        return super.format() + "\n Expiration Year: "
                + expYear;
    }
    
    public String toString()
    {
    	return "DriverLicense[name=" + getName() + "] [Expiration Year="
    			+ expYear;
    }
    
    public boolean equals(Object other)
    {
    	if(!super.equals(other))
    	{
    		return false;
    	}
    	DriverLicense otherCard = (DriverLicense) other;
    	return expYear == otherCard.expYear;
    }
}
