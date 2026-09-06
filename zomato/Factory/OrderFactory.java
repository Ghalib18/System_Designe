package zomato.Factory;

import java.util.List;

import zomato.Order;
import zomato.model.MenuItem;
import zomato.model.Restuarant;
import zomato.model.User;
import zomato.strategies.Payment;

public interface OrderFactory {

    Order createOrder(User user ,Restuarant restuarant,List<MenuItem> menu, Payment payment,double total,String orderType);
    
}
