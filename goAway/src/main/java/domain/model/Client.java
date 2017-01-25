package domain.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity
@Table(name="people")
@NamedQueries({
       @NamedQuery(name = "person.all", query = "SELECT p FROM Person p"),
        @NamedQuery(name = "person.id", query = "FROM Person p WHERE p.id=:id")
})

public class Client implements IHaveId{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String surname;
	private String passportNumber;
	private int tourId;
	

    @OneToMany(mappedBy="person", fetch = FetchType.LAZY)
	private List<Tour> tours = new ArrayList<Tour>();
    

	public void setTours(List<Tour> tours) {
		this.tours = tours;
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
