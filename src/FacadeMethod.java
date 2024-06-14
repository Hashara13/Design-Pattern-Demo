/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hashara
 */
interface PickMe{
    void enterDestination(String drop);
}
  
class Ride implements PickMe{
    @Override
    public void enterDestination(String drop){
        System.out.println("Ride destination set to: " + drop);
    }
     public void chooseVehicleType(String vehicle){
        System.out.println("Ride booked to a: "+vehicle);
    }
}

class Food implements PickMe{
    @Override
    public void enterDestination(String drop){
        System.out.println("Food delivery set to:  "+ drop);
    }
     public void chooseOutlet(String outlet){
        System.out.println("Food ordered From: "+outlet);
    }
}

// facade Class
class PickmeFacade{
    Ride getRide;
    Food getFood;
    
    public PickmeFacade(){
      getRide=new Ride();
      getFood=new Food();
    }
    
    public void ride(String drop, String vehicle){
        getRide.enterDestination(drop);
        getRide.chooseVehicleType(vehicle);
    }
    
      public void food(String drop, String outlet){
        getFood.enterDestination(drop);
        getFood.chooseOutlet(outlet);
    }
    
}

// client class
public class FacadeMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PickmeFacade obj=new PickmeFacade();
        
        
        obj.ride("Colombo 09","Car");
        System.out.println();
        obj.food("Negombo","FLOW");
    }
    
}
