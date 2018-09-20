/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author DANYAV
 */
public class Truck {
    public int cadence;
    public int gear;
    public int speed;
    
    public Truck (int startCandence, int startSpeed, int startGear){
        gear = startGear;
        cadence = startCandence;
        speed = startSpeed;
    }
    public void setCandence (int newValue)
    {
        cadence = newValue;
    }
    public  void setGear (int newValue)
    {
        gear = newValue;
    }
    public void applybrake (int decrement)
    {
        speed = decrement;
    }
    public void speedUp(int increment)
    {
        speed = increment;
    }
    
    }
    

