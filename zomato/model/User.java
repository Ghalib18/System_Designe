package zomato.model;

import zomato.Cart;

public class User {
    private Long id;
    private String name;
    private String address;
    private Cart cart;
    
    public User(Long id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

    public Long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }

}
