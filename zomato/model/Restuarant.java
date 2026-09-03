package zomato.model;
import java.util.List;


public class Restuarant {

    private Long id;
    private String name;
    private String address;
    private List<MenuItem> mt;

    public Restuarant(Long id,String name, String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public List<MenuItem> getMt(){
        return this.mt;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAdress(String address){
        this.address=address;
    }
    
}
