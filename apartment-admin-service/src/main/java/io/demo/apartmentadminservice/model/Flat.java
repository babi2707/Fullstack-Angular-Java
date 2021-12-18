package io.demo.apartmentadminservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flat")
public class Flat {
	@Id
	private Long id;
	private String unit;
	private String configuration;
	private String currentstatus;
	private String apartment;
	
	public Flat() {
		
	}

	public Flat(Long id, String unit, String configuration, String currentstatus, String apartment) {
		super();
		this.id = id;
		this.apartment = apartment;
		this.unit = unit;
		this.configuration = configuration;
		this.currentstatus = currentstatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApartment() {
		return apartment;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getConfiguration() {
		return configuration;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}

	public String getCurrentstatus() {
		return currentstatus;
	}

	public void setCurrentstatus(String currentstatus) {
		this.currentstatus = currentstatus;
	}	
}
