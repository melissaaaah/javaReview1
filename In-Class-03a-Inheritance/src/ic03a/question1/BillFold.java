package ic03a.question1;

public class BillFold extends Card
{
   private Card card1;
   private Card card2; 
    
   public BillFold(Card card1, Card card2)
   {
       super();
       this.card1 = card1;
       this.card2 = card2;
   }
   
    public BillFold()
{
    super();
}

    public void addCard(Card newCard)
    {
        if(card1 == null)
        {
            card1 = newCard;
        }
        else if (card2 == null)
        {
            card2 = newCard; 
        }
    }
    public String formatCards()
    {
       return "BillFold [" + card1.format() + "|" + card2.format() + "]";
    }
}
