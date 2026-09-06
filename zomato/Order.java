package zomato;

import java.util.ArrayList;
import java.util.List;

import zomato.model.MenuItem;
import zomato.model.Restuarant;
import zomato.model.User;
import zomato.strategies.Payment;

public abstract class Order {
    public static int nextOrderId=0;

    protected int orderId;
    protected Restuarant restuarant;
    protected List<MenuItem> items=new ArrayList<>();
    protected User  user;
    protected Payment payment;
    protected double total;
    protected String schedule;
    public abstract String getType();
    
    public Order(){
        this.user=null;
        this.restuarant=null;
        this.items=null;
        this.payment=null;
        total=0.0;
        schedule="";
        orderId=++nextOrderId;

    }

    public int getId(){
        return orderId;
    }

    public void setUser(User user){
        this.user=user;
    }
    public User getUser(){
        return this.user;
    }

    public void setRestuarant(Restuarant restuarant){
        this.restuarant=restuarant;
    }
    public Restuarant getRestuarant(){
        return this.restuarant;
    }
    public void setMenu(List<MenuItem> it){
        this.items=it;
        total=0;

        for(MenuItem x:items){
            total+=x.getPrice();
        }
    }

    public List<MenuItem> getMenu(){
        return items;
    }

    public void setPayment(Payment p){
        payment=p;
    }
    public void setTotal(double amt){
        total=amt;
    }
    public double getTotal(){
        return total;
    }

    public void setSchedule(String sch){
        schedule=sch;
    }
    public String getSchedule(){
        return schedule;
    }
    public void paymentService(){
        if(payment!=null){
            payment.pay(total);
        }
        else{
            System.out.println("No Payment Mode has been selected");
        }
    }


    
}
