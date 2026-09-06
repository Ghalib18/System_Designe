package zomato.strategies;

public class UpiStrategy implements Payment {
    
    private String mobileNo;
    public UpiStrategy(String mobileNo){
        this.mobileNo=mobileNo;
    }

    public void pay(double amount){
        System.out.println("This amount "+ amount + "is paid by "+ mobileNo);

    }
}
