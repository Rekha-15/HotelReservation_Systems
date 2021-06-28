/************************************************************************************
 * @purpose Implementing Hotel Reservation System Program
 * @author Rekha
 * version 1.0
 * since 14-06-2021
 ************************************************************************************/
package com.Hotelreservationsystem;

public class Hotel 
{
	    // Parameters Instance Variable 
	    private String hotelName;
	    private int regularRate;
	    //Parameterized Constructor
	    public Hotel(String hotelName, int regularRate)
	    {
	    	// differnciate b/w global name and method parameters
	        this.hotelName = hotelName;
	        this.regularRate = regularRate;
	    }

}