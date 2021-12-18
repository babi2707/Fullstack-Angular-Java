package io.demo.flatsinfoservice.model;

public class Flat {
	private int id;
	private String apartment;
	private String unit;
	private String configuration;
	private int status;
	
	public Flat(int id, String apartment, String unit, String configuration, int status) {

		this.id = id;
		this.apartment = apartment;
		this.unit = unit;
		this.configuration = configuration;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}
	public String getApartment() {
		return apartment;
	}
	public String getUnit() {
		return unit;
	}
	public String getConfiguration() {
		return configuration;
	}
	public int getStatus() {
		return status;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setApartment(String apartment) {
		this.apartment = apartment;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
