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
}
