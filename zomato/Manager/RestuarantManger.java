package zomato.Manager;

import java.util.ArrayList;
import java.util.List;

import zomato.model.Restuarant;

public class RestuarantManger {
    private List<Restuarant> RestuarantList= new ArrayList<Restuarant>();
    private static RestuarantManger instance=null;

    private RestuarantManger(){
        // private the consturctor so it instant cannot be made.
        // As because it is singleton class , so only one object
    }

    public RestuarantManger getInstance(){
        if(instance==null){
            instance=new RestuarantManger();

         }
         return instance;
    }

    public void addRestuarant(Restuarant restuarant){
        RestuarantList.add(restuarant);
    }

    public List<Restuarant> searchByLoc(String loc){
        List<Restuarant> result=new ArrayList<>();
        String s1=loc.toLowerCase();

        for(Restuarant r:RestuarantList){
            String s2=r.getAddress().toLowerCase();
            if(s1.equals(s2)){
                result.add(r);
            }
        }

        return result;
    }
    
}
