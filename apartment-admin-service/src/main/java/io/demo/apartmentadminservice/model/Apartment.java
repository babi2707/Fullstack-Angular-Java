package io.demo.apartmentadminservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="apartment")
public class Apartment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // GenerationType.auto looks for hibernate_sequence table
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="city")
	private String city;
	
	public Apartment() {
		
	}
	
	public Apartment(Long id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
