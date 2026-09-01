 
 
 interface Burger{
 
    void prepare();
 }

 class BasicBurger implements Burger{
    
    public void prepare(){
        System.out.println("We are going to make the world famous Basic burger of KFC");
    }
 }
 
 
 class StandardBurger implements Burger{
    
    public void prepare(){
        System.out.println("We are going to make the world famous Standard burger of KFC");
    }
 }
 
 class PremimumBurger implements Burger{
    
    public void prepare(){
        System.out.println("We are going to make the world famous Premimum burger of KFC");
    }
 }
 
 class BasicWheatBurger implements Burger{
    
    public void prepare(){
        System.out.println("We are going to make the world famous Basic burger of Burger-King");
    }
 }
 
 class StandardWheatBurger implements Burger{
    
    public void prepare(){
        System.out.println("We are going to make the world famous Standard burger of Burger-King");
    }
 }
 
 class PremimumWheatBurger implements Burger{
    
    public void prepare(){
        System.out.println("We are going to make the world famous Premimum burger of Burger-King");
    }
 
}

interface Pizza{
 
    void prepare();
 }

 class BasicPizza implements Pizza{
    
    public void prepare(){
        System.out.println("We are going to make the world famous Basic Pizza of KFC");
    }
 }
 
 
 class StandardPizza implements Pizza{
    
    public void prepare(){
        System.out.println("We are going to make the world famous Standard Pizza of KFC");
    }
 }
 
 class PremimumPizza implements Pizza{
    
    public void prepare(){
        System.out.println("We are going to make the world famous Premimum Pizza of KFC");
    }
 }
 
 class BasicWheatPizza implements Pizza{
    
    public void prepare(){
        System.out.println("We are going to make the world famous Basic Pizza of Burger-King");
    }
 }
 
 class StandardWheatPizza implements Pizza{
    
    public void prepare(){
        System.out.println("We are going to make the world famous Standard Pizza of Burger-King");
    }
 }
 
 class PremimumWheatPizza implements Pizza{
    
    public void prepare(){
        System.out.println("We are going to make the world famous Premimum Pizza of Burger-King");
    }
 
}


interface MealFactory{
    Burger creatBurger(String type);
    Pizza createPizza(String type);
}

class KFCFactory implements MealFactory{

    public Burger creatBurger(String type){
        if(type.equalsIgnoreCase("basic")){
            return new BasicBurger();
        }
        else if(type.equalsIgnoreCase("standard")){
            return new StandardBurger();
        }
        else if (type.equalsIgnoreCase("premimum")) {
            return new PremimumBurger();
        }
        else {
             System.out.println("Invalid-option");
             return null;
        }
    }

    public Pizza createPizza(String type){
        if(type.equalsIgnoreCase("basic")){
            return new BasicPizza();
        }
        else if(type.equalsIgnoreCase("standard")){
            return new StandardPizza();
        }
        else if (type.equalsIgnoreCase("premimum")) {
            return new PremimumPizza();
        }
        else {
             System.out.println("Invalid-option");
             return null;
        }
    }
}

class BurgerKingFactory implements MealFactory{
    public Burger creatBurger(String type){
        if(type.equalsIgnoreCase("basic")){
            return new BasicWheatBurger();
        }
        else if(type.equalsIgnoreCase("standard")){
            return new StandardWheatBurger();
        }
        else if (type.equalsIgnoreCase("premimum")) {
            return new PremimumWheatBurger();
        }
        else {
             System.out.println("Invalid-option");
             return null;
        }
    }
     public Pizza createPizza(String type){
        if(type.equalsIgnoreCase("basic")){
            return new BasicWheatPizza();
        }
        else if(type.equalsIgnoreCase("standard")){
            return new StandardWheatPizza();
        }
        else if (type.equalsIgnoreCase("premimum")) {
            return new PremimumWheatPizza();
        }
        else {
             System.out.println("Invalid-option");
             return null;
        }
    }
}





public class AbstractFactory{
    public static void main(String[] args){

        String type="Standard";

        MealFactory m1=new BurgerKingFactory();
        MealFactory m2=new KFCFactory();

       Burger p1=m1.creatBurger(type);
       Pizza p2=m2.createPizza("Premimum");
       p1.prepare();
       p2.prepare();

    }
}