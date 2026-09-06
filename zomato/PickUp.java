package zomato;

public class PickUp extends Order {

    private String restuarantAddress;

    public PickUp(){
        restuarantAddress="";
    }

    public String getType(){
        return "PickUp";
    }

    public void setRestuarantAddress(String add){
        restuarantAddress=add;
    }
    public String getRestuarantAddress(){
        return restuarantAddress;
    }
    
}
