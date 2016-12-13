package domain.model;

import java.math.BigDecimal;

import java.sql.Date;

public class Tour extends EnumDictionary implements IHaveId{

	private int id;
	private String name;
	private Date dateOfDeparture;
	private double price;
	private String countryFrom;
	private String countryTo;
	private int amountOfDays;
	private Client client;
	private EnumDictionary EnumDictionary;
	
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
	
	public String getCountryFrom() {
		return countryFrom;
	}
	public void setCountryFrom(String countryFrom) {
		this.countryFrom = countryFrom;
	}
	public String getCountryTo() {
		return countryTo;
	}
	public void setCountryTo(String countryTo) {
		this.countryTo = countryTo;
	}
	public int getAmountOfDays() {
		return amountOfDays;
	}
	public void setAmountOfDays(int amountOfDays) {
		this.amountOfDays = amountOfDays;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public EnumDictionary getEnumDictionary() {
		return EnumDictionary;
	}
	public void setEnumDictionary(EnumDictionary enumDictionary) {
		EnumDictionary = enumDictionary;		
	}
}

