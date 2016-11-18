package domain.model;

import java.util.Date;

public class Tour {

	private int id;
	private String name;
	private Date dateOfDeparture;
	private double price;
	private String cityOfDeparture;
	private int amountOfDays;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}
	
	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getCityOfDeparture() {
		return cityOfDeparture;
	}
	
	public void setCityOfDeparture(String cityOfDeparture) {
		this.cityOfDeparture = cityOfDeparture;
	}
	
	public int getAmountOfDays() {
		return amountOfDays;
	}
	
	public void setAmountOfDays(int amountOfDays) {
		this.amountOfDays = amountOfDays;
	}
}
