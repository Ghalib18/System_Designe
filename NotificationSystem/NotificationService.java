package NotificationSystem;

///......................................................
///................Notification Decorator................
///......................................................

interface Inotification{
    String getContent();
}

class SimpleNotification implements Inotification{
     private String text;
     public SimpleNotification(String text){
        this.text=text;
     }
    public String getContent(){
       return text;
    }
}

abstract class Idecorator implements Inotification{
    protected Inotification notification;

    public Idecorator(Inotification notification){
        this.notification=notification;
    }
}

class Timestamp extends Idecorator{
    public Timestamp(Inotification n){
        super(n);
    }
   public String getContent(){
    return "[2025-04-13 14:22:00] "+notification.getContent();
   }  
}

class Sign extends Idecorator{
    public Sign(Inotification n){
        super(n);
    }

    public String getContent(){
        return notification.getContent()+"  is Digital-Sign";
    }
}





public class NotificationService {
        public static void main(String [] args){


        }    
}
