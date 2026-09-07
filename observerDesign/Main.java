package observerDesign;

import observerDesign.ConcreteClass.Subscribers;

import observerDesign.ConcreteClass.Observerable;

public class Main {

    public static void main(String [] args){
      
        Observerable channel=new Observerable("Codfiy");

        Subscribers s1= new Subscribers("Ghalib", channel);
        Subscribers s2= new Subscribers("hussain", channel);

        channel.addObserver(s2);
        channel.addObserver(s1);


        channel.uploadVideo("Binary Search Algorithm In One Shot");

        channel.removeObserver(s2);

        channel.uploadVideo("Rat in a maze solve using Backtracking");


        

    }
    
}
