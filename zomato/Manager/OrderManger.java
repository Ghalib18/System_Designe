package zomato.Manager;

import java.util.ArrayList;
import java.util.List;

import zomato.Order;
import zomato.model.User;

public class OrderManger {

    private List<Order> OrderList=new ArrayList<>();
    public static OrderManger instance=null;

    private OrderManger(){
        // the constructor is made private , so that this class can be make as singleton class
    }
    public OrderManger getIntance(){
        if(instance==null){
            instance= new OrderManger();
           }

           return instance;
    }

    public void addOrder(Order order){
        OrderList.add(order);
    }

    public void getAllUserOrder(User user){
        for(Order o:OrderList){
            if(user==o.getUser()){
                 System.out.println(o.getType() + " order for " + o.getUser().getName()
                    + " | Total: ₹" + o.getTotal()
                    + " | At: " + o.getSchedule());
            }
        }
    }

    public void getAllOrder(){
        for(Order o:OrderList){
            System.out.println(o.getType() + " order for " + o.getUser().getName()
                    + " | Total: ₹" + o.getTotal()
                    + " | At: " + o.getSchedule());
        }
    }
    
}
