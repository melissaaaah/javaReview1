package ic03a.question1;

public class IDCard extends Card
{
    private int idNumber;
    
    public IDCard (String n, int idNum)
    {
        super(n);
        idNumber = idNum;
    }
    
    public String format()
    {
        return super.format() + "\nID Number: " + idNumber;
    }
    
    public String toString()
    {
    	return "IDCard[name=" + getName() + "] [idNumber=" + idNumber + "]";
    }
    
    public boolean equals(Object other)
    {
    	if(!super.equals(other))
    	{
    		return false;
    	}
    	IDCard otherCard = (IDCard) other;
    	return idNumber == otherCard.idNumber;
    }
}
