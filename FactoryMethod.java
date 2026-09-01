 
 
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

interface BurgerFactory{
    Burger creatBurger(String type);
}

class KFCFactory implements BurgerFactory{
    public Burger creatBurger(String type){
        if(type.equalsIgnoreCase("basic")){
            return new BasicBurger();
        }
        else if(type.equalsIgnoreCase("starndard")){
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
}

class BurgerKingFactory implements BurgerFactory{
    public Burger creatBurger(String type){
        if(type.equalsIgnoreCase("basic")){
            return new BasicWheatBurger();
        }
        else if(type.equalsIgnoreCase("starndard")){
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
}




public class FactoryMethod {
    
    public static void main(String [] args){
       String type="Basic";

       BurgerFactory b1=new BurgerKingFactory();

       Burger burger=   b1.creatBurger(type);
          burger.prepare();    
    }
}
