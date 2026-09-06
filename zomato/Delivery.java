package zomato;

public class Delivery extends Order {

    private String userAddress;

    public Delivery(){
        userAddress="";
    }

    public String getType(){
        return "Delivery";
    }

    public void setUserAddress(String add){
        userAddress=add;
    }
    public String getUserAddress(){
        return userAddress;
    }
    
}
