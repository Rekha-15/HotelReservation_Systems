/************************************************************************************
 * @purpose Implementing Hotel Reservation System Program
 * @author Rekha
 * version 1.0
 * since 14-06-2021
 ************************************************************************************/
package com.Hotelreservationsystem;

public class Hotel {
	public String name;
	public int regularWeekDayRate;
	public int regularWeekEndRate;
    public int totalRegularRate;
    public int rating;

	/**
	 * Created a parameterize constructor of the class hotel .
	 * 
	 * @param name
	 * @param regularWeekDayRate
	 * @param regularWeekEndRate
	 * @param rating 
	 */
	public Hotel(String name, int regularWeekDayRate, int regularWeekEndRate, int rating) {
		this.name = name;
		this.regularWeekDayRate = regularWeekDayRate;
		this.regularWeekEndRate = regularWeekEndRate;
		this.rating = rating;

	}

	@Override
	public String toString() {
		return "Hotel Name: " + name + " " + "\nRegularWeekDayRate: " + regularWeekDayRate + "\nRegularWeekEndRate: " + regularWeekEndRate + "\nRating: " + rating ;
	}
}