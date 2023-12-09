package com.hotelapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.hotelapp.models.Address;
import com.hotelapp.models.Delivery;
import com.hotelapp.models.Hotel;
import com.hotelapp.models.Menu;
import com.hotelapp.service.HotelService;


@SpringBootApplication
public class SpringHotelappRestapiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringHotelappRestapiApplication.class, args);
	}
    
	@Autowired
	HotelService hotelService;
	@Override
	public void run(String... args) throws Exception {
	  Address address = new Address("Bandlamitta", "Ongole", 523001, "AP");
	  Menu menu1 = new Menu("Chapathi", 30);
	  Menu menu2 = new Menu("Pizza", 200);
	  Set<Menu>menuList = new HashSet<>(Arrays.asList(menu1,menu2));
	  Delivery del1 = new Delivery("swiggy", 120);
	  Delivery del2 = new Delivery("Uber", 130);
	  Set<Delivery> deliveryList = new HashSet<>(Arrays.asList(del1,del2));
	  Hotel hotel = new Hotel("A2B",address,menuList,deliveryList);
	  hotelService.addHotel(hotel);
		
	}

}
