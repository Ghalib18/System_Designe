package zomato.Factory;

import java.util.List;

import zomato.Delivery;
import zomato.Order;
import zomato.PickUp;
import zomato.model.MenuItem;
import zomato.model.Restuarant;
import zomato.model.User;
import zomato.strategies.Payment;

public class ScheduleOrder implements OrderFactory {

    private String scheduleTime;

    public ScheduleOrder(String scheduleTime ){
        this.scheduleTime=scheduleTime;
    }

    public Order createOrder(User user ,Restuarant restuarant,List<MenuItem> menu, Payment payment,double total,String orderType){
        Order order=null;
        
        if(orderType.equalsIgnoreCase("Delivery")){
            Delivery delivery=new Delivery();
            delivery.setUserAddress(user.getAddress());

            order=delivery;
        }
        else{
            PickUp pickUp=new PickUp();
            pickUp.setRestuarantAddress(restuarant.getAddress());

            order=pickUp;

        }

        order.setMenu(menu);
        order.setPayment(payment);
        order.setRestuarant(restuarant);
        order.setTotal(total);
        order.setUser(user);
        order.setSchedule(scheduleTime);


        return order;
    }
    
}
