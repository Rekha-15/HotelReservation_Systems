/************************************************************************************
 * @purpose Implementing Hotel Reservation System Program
 * @author Rekha
 * version 1.0
 * since 14-06-2021
 ************************************************************************************/
package com.Hotelreservationsystem;

import org.junit.BeforeClass;
import org.junit.Test;

public class HotelReservationTest 
{
    static HotelReservation hotelReservation;
    @BeforeClass
    public static void initialize()
    {
        hotelReservation = new HotelReservation();
    }

    @Test
    public void shouldPrintWelcomeMessage()
    {
    	//Create object
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.printWelcomeMessage();
        hotelReservation.addHotelDetails();

    }

}
