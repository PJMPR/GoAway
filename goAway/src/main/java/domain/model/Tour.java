package domain.model;

import java.util.Date;

public class Tour extends EnumDictionary implements IHaveId{

	private int id;
	private String name;
	private Date dateOfDeparture;
	private double price;
	private String cityOfDeparture;
	private int amountOfDays;
	private Payment payment;
	private Client client;
	private Hotel hotel;
	private Employee employee;
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
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public EnumDictionary getEnumDictionary() {
		return EnumDictionary;
	}
	public void setEnumDictionary(EnumDictionary enumDictionary) {
		EnumDictionary = enumDictionary;
	}
}

