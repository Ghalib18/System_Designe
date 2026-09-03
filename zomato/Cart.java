package zomato;

import java.util.List;

import zomato.model.MenuItem;


public class Cart {
    private List<MenuItem> mt;
   

    public List<MenuItem> addMenuItem(MenuItem m1){
        mt.add(m1);
        return mt;
    }
    public boolean removeMenuItem(MenuItem m1){
        
        return mt.remove(m1);
    }

    public List<MenuItem> clearMenu(){
        mt.clear();
        return mt;
    }

    public boolean isEmpty(){
        return mt.isEmpty();
    }
}
