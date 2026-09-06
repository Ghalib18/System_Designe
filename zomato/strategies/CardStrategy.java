package zomato.strategies;

public class CardStrategy implements Payment {

    private String cardNo;
    public CardStrategy(String cardNo){
        this.cardNo=cardNo;
    }
    public void pay(double amount){
         System.out.println("This amount "+ amount + "is paid by this cardNo. :"+ cardNo);
    }
    
}
