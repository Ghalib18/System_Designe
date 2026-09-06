package zomato.Factory;

import java.util.List;

import zomato.Delivery;
import zomato.Order;
import zomato.PickUp;
import zomato.model.MenuItem;
import zomato.model.Restuarant;
import zomato.model.User;
import zomato.strategies.Payment;
import zomato.utils.TimeUtils;

public class BookNow implements OrderFactory {
     
    public  Order createOrder(User user ,Restuarant restuarant,List<MenuItem> menu, Payment payment,double total,String orderType){
        Order order=null;

        if(orderType.equalsIgnoreCase("Delivery")){
             Delivery delivery= new Delivery();

             delivery.setUserAddress(user.getAddress());
             order=delivery;
        }
        else{
            PickUp pickUp=new PickUp();

            pickUp.setRestuarantAddress(restuarant.getAddress());
            order=pickUp;

        }

        order.setMenu(menu);
        order.setRestuarant(restuarant);
        order.setPayment(payment);
        order.setUser(user);
        order.setTotal(total);
        order.setSchedule(TimeUtils.getCurrentTime());

        return order;
    }
    
}
