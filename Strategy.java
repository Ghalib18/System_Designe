

public class Strategy {

    public interface Talkable {

        void talk();
    }

    public interface Walkable {
         
        void walk();
    }

    public interface Flyable {
         
        void fly();
    }

    public static class NormalWalk implements Walkable{
        
        @Override
        public void walk(){
            System.out.println("Yes the robot can walk normally");
        }
    }

    public  static class NoWalk implements Walkable {
    
        public void walk(){
            System.out.println("the Robot cannot walk");
        }
        
    }

    public  static class NormalTalk implements Talkable{
        
        public void talk(){
            System.out.println("Yes the robot can talk normally");
        }
    }
    public static class  NoTalk implements Talkable{

        public void talk(){
            System.out.println("The robot Cannot Talk");
        }
    }

    public static class NormalFly implements Flyable{

        public void fly(){
            System.out.println("Yes the robot can fly");
        }
    }

    
    public static class NoFly implements Flyable{

        public void fly(){
            System.out.println("the robot cannot fly");
        }
    }

    
    public  static class JetFly implements Flyable{

        public void fly(){
            System.out.println("Yes the robot can fly with the help of jet");
        }
    }

    public static class Robot {

        Talkable takii;
        Walkable wakii;
        Flyable flyii;

        public Robot(Talkable t , Walkable w , Flyable f){
            this.flyii=f;
            this.takii=t;
            this.wakii=w;
        }

        public  void projection(){
            takii.talk();
            wakii.walk();
            flyii.fly();
        }
    
        
    }

    public static void main(String [] args){
        Robot robot= new Robot(new NormalTalk(),new NormalWalk(), new JetFly());

        robot.projection();
    }
}
