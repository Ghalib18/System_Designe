package zomato.service;
import java.util.List;

import zomato.Order;
import zomato.model.MenuItem;

public class Nofication {

    public static void notify(Order order){


        System.out.println("\nNotification: New " + order.getType() + " order placed!");
        System.out.println("---------------------------------------------");
        System.out.println("Order ID: " + order.getId());
        System.out.println("Customer: " + order.getUser().getName());
        System.out.println("Restaurant: " + order.getRestuarant().getName());
        System.out.println("Items Ordered:");

        List<MenuItem> items = order.getMenu();
        for (MenuItem item : items) {
            System.out.println("   - " + item.getName() + " (₹" + item.getPrice() + ")");
        }

        System.out.println("Total: ₹" + order.getTotal());
        System.out.println("Scheduled For: " + order.getSchedule());
        System.out.println("Payment: Done");
        System.out.println("---------------------------------------------");

    }
    
}
