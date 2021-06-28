/************************************************************************************
 * @purpose Implementing Hotel Reservation System Program
 * @author Rekha
 * version 1.0
 * since 14-06-2021
 ************************************************************************************/
package com.Hotelreservationsystem;

import java.util.ArrayList;

/**
 * HotelReservation is a class of public type
 * @author rekha
 *
 */

public class HotelReservation 

/**
 * Created a array list name as hotelsList
 *
 */

{
    ArrayList<Hotel> hotelList = new ArrayList<>();
    public void printWelcomeMessage() 
    {
        System.out.println("Welcome to the Hotel Reservation Program");
    }
   
    /**
     * addHotelDetails is a method of public void type
     * Created a method addHotelDetails to add the hotels in the array list.
     */
    
    public void addHotelDetails() 
    {
    	//Call Values in constructor
    	
        hotelList.add(new Hotel("Lakewood", 110));
        hotelList.add(new Hotel("Bridgewood", 150));
        hotelList.add(new Hotel("Ridgewood", 220));
    }

}