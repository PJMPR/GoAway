package domain.model;

public class Client implements IHaveId{

	private int id;
	private String name;
	private String surname;
	private String passportNumber;
	private int tourId;
	
	public Client() {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.passportNumber = passportNumber;
		this.tourId = tourId;
		
	}
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	
	public int getTourId() {
		return tourId;
	}
	
	public void setTourId(int tourId) {
		this.tourId = tourId;
	}
}
