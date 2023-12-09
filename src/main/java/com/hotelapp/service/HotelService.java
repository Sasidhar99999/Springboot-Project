package com.hotelapp.service;

import java.util.List;

import com.hotelapp.models.Hotel;

public interface HotelService {
	
	void addHotel(Hotel hotel);
	void updateHotel(Hotel hotel);
	Hotel getHotelById(int HotelId);
	void deleteHotel(int HoteId);
	
	List<Hotel> getHotelsByCity(String city);
	List<Hotel> getHotelsByMenu(String menuName);
	List<Hotel> getHotelsByDelivery(String partnerName);
	List<Hotel> getHotelsByLocation(String location);
	List<Hotel> getHotelsByLocationAndMenu(String location,String menuName);
}

