package ic03a.question1;

public class callingCard extends Card
{
    private int cardNumber;
    private int pin;
    
    public callingCard(String n, int num, int pinNum)
    {
        super(n);
        cardNumber = num;
        pin = pinNum;
    }
    
    public String format()
    {
        return super.format() + " Card Number: " + cardNumber 
                + " PIN Number: " + pin;
    }
    
    public String toString()
    {
    	return "callingCard[name=" + getName() + "] [cardNumber=" + cardNumber
    			+ ",pin=" + pin;
    }
    
    public boolean equals(Object other)
    {
    	if(!super.equals(other))
    	{
    		return false;
    	}
    		callingCard otherCard = (callingCard) other;
    		return cardNumber == otherCard.cardNumber &&
    				pin == otherCard.pin;
    }
}
