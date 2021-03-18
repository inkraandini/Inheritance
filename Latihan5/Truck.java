/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author MOKLET-2
 */
public class Truck {
      //the truck class has three fields 
    public int cadance;
    public int gear;
    public int speed;
   //the truck class has one construktor
    public Truck (int startCadence, int startGear, int startSpeed){
        this.cadance = startCadence;
        this.gear = startGear;
        this.speed = startSpeed;
    }
    
    //the truck class has four method

    public void setCadance(int newValue) {
        cadance = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }
    public void applybrake (int decrement){
        speed = decrement;
    }
    public void speedUp (int increment){
        speed = increment;
    }
}
