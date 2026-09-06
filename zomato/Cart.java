package zomato;

import java.util.ArrayList;
import java.util.List;

import zomato.model.MenuItem;
import zomato.model.Restuarant;


public class Cart {
    private List<MenuItem> mt=new ArrayList<>();
    private Restuarant restuarant;

    public Cart(){
        restuarant=null;
    }
   

    public List<MenuItem> addMenuItem(MenuItem m1){
        mt.add(m1);
        return mt;
    }
    public boolean removeMenuItem(MenuItem m1){
        
        return mt.remove(m1);
    }

    public List<MenuItem> clearMenu(){
        mt.clear();
        mt=null;
        return mt;
    }

    public boolean isEmpty(){
        return mt.isEmpty();
    }

    public void setRestuarant(Restuarant rs){
        this.restuarant=rs;

    }
    public Restuarant getRestuarant(){
        return restuarant;
    }
    public List<MenuItem> getMenuItem(){
        return mt;
    }
}
