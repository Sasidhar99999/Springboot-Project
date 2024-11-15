package com.hotelapp.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter	
@NoArgsConstructor

public class Address {
	
	@Id
	@GeneratedValue(generator = "Add_id",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "Add_id",sequenceName = "Add_id")
	private Integer addressId;
	private String streetName;
	private String city;
	private long zipcode;
	private String state;
	public Address(String streetName, String city, long zipcode, String state) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.zipcode = zipcode;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + ", zipcode=" + zipcode + ", state=" + state
				+ "]";
	}
}
