package observerDesign.ConcreteClass;

import observerDesign.Interface.Observer;

public class Subscribers implements Observer{

    private String name;
    private Observerable channel;

    public Subscribers(String name, Observerable channel){
        this.name=name;
        this.channel=channel;
    }
   
    public void update(){
      System.out.println("Hey " + name + "," + channel.getVideoData());
    }
    
}
