package observerDesign.ConcreteClass;

import java.util.ArrayList;
import java.util.List;

import observerDesign.Interface.Observer;
import observerDesign.Interface.Subject;

public class Observerable implements Subject{
    private List<Observer> observerList;
    private String name;
    private String latestVideo;

    public Observerable(String name){
        this.name=name;
        observerList=new ArrayList<>();
    }

    public void addObserver(Observer ob){
        observerList.add(ob);
    }
    public void removeObserver(Observer ob){
        observerList.remove(ob);
    }

    public void notifyTheObserver(){
        for(Observer o: observerList){
            o.update();
        }
    }
    public void uploadVideo(String title){
        latestVideo=title;
        System.out.println("\n[" + name + " uploaded \"" + title + "\"]");
        notifyTheObserver();
    }

     public String getVideoData() {
        return "\nCheckout our new Video : " + latestVideo + "\n";
    }
    
}
