package com.hotelapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.models.Hotel;
import com.hotelapp.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	HotelRepository hotelRepository;
	
	@Override
	public void addHotel(Hotel hotel) {
		hotelRepository.save(hotel);
	}

	@Override
	public void updateHotel(Hotel hotel) {
		hotelRepository.save(hotel);
	}

	@Override
	public Hotel getHotelById(int HotelId) {
		return hotelRepository.findById(HotelId).get();
	}

	@Override
	public void deleteHotel(int HoteId) {
		hotelRepository.deleteById(HoteId);

	}

	@Override
	public List<Hotel> getHotelsByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getHotelsByMenu(String menuName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getHotelsByDelivery(String partnerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getHotelsByLocation(String location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getHotelsByLocationAndMenu(String location, String menuName) {
		// TODO Auto-generated method stub
		return null;
	}

}
