// nothing too fancy just implemented the basic version of factory pattern design which is called simple factory pattern
// in this we separate the object creation from the client side and managed them in separte class know as BurgerFactory
// so the client can't see how the things are managed in backend.....

 interface Burger {

     void prepare();
}

 class BasicBurger implements Burger{
    public void prepare(){
        System.out.println("BasicBurger");
    }
}
  class StandardBurger implements Burger{
    public void prepare(){
        System.out.println("StandardBurger");
    }
}
  class PremimumBurger implements Burger{
    public void prepare(){
        System.out.println("PremimumBurger");
    }
}
  class BurgerFactory{
     public Burger createBurger(String type){
        if(type=="basic"){
            return new BasicBurger();
        }
        else if(type.equalsIgnoreCase("standard")){
            return new StandardBurger();
        }
        else if(type.equalsIgnoreCase("premimum")){
            return new PremimumBurger();
        }
        else return null;
    }
}



public class SimpleFactory {


// main method
    public static void main (String [] args){
     String type="basic";
     BurgerFactory bf=new BurgerFactory();
     Burger b1=bf.createBurger(type);
     if(b1==null) System.out.println("No burger found");
     b1.prepare();

    }
}