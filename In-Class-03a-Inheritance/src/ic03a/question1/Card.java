package ic03a.question1;

public class Card
{
    protected String name;

    public Card()
    {
       name = "";
    }

    public Card(String n)
    {
       name = n;
    }

    public String getName()
    {
       return name;
    }

    public boolean isExpired()
    {
       return false;
    }

    public String format()
    {
       return "Card holder: " + name;
    }
    
    public String toString()
    {
    	return "Card[name=" + name;
    }
    
    public boolean equals(Object other)
    {
    	if(other == null)
    		return false;
    	if(getClass() != other.getClass())
    		return false;
    	
    	Card otherCard = (Card) other;
    	return name.equals(otherCard.name);
    }

}
