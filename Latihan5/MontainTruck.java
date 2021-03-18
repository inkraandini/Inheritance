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
public class MontainTruck extends Truck{
    //the montaintruck subclass adds one field
    public int seatHeight;
    //the montaintruck subclass has one construktor
    public MontainTruck(int startHeight, int startCadence, int startGear, int startSpeed){
        super(startCadence, startGear, startSpeed);
        seatHeight = startHeight;
    }
    //the montaintruck subclass adds one method
    public void seatHeight(int newValue){
        seatHeight = newValue;
    }
    public static void main(String[] args){
        System.out.println("mulai Berjalan");
        MontainTruck MB = new MontainTruck(0,0,0,0);
        System.out.println("gear = " + MB.gear);
        System.out.println("speed = " + MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("gear = " + MB.gear);
        System.out.println("speed = " + MB.speed);
        MB.speedUp(2);
        System.out.println("gear = " + MB.gear);
        System.out.println("speed = " + MB.speed);  
    }
}
