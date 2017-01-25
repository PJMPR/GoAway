package domain.model;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

import java.sql.Date;

@XmlRootElement
@Entity
@NamedQueries({
	@NamedQuery(name="tour.id", query="FROM Tour w WHERE t.id=:id"),
	@NamedQuery(name="tour.client_id", query="FROM Tour w WHERE t.client.id=:client_Id")
})

public class Tour extends EnumDictionary implements IHaveId{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String name;
	private Date dateOfDeparture;
	private double price;
	private String countryFrom;
	private String countryTo;
	private int amountOfDays;
	private int clientId;
	private int enumDictionaryId;
	private Country country;
	private BigDecimal asset;
	
	public Tour() {
		this.id = id;
		this.name = name;
		this.dateOfDeparture = dateOfDeparture;
		this.price = price;
		this.countryFrom = countryFrom;
		this.countryTo = countryTo;
		this.amountOfDays = amountOfDays;
		this.enumDictionaryId = enumDictionaryId;
	}
	
	@ManyToOne
	private Client client;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Country getCountry(){
		return country;
	}
	
	public void setCountry(Country country){
		this.country = country;
	}
	
	 public BigDecimal getAsset() {
	        return asset;
	    }

	    public void setAsset(BigDecimal asset) {
	        this.asset = asset;
	}
	    
	public Client getClient(){
		return client;
	}
	
	public void setClient(Client client){
		this.client = client;
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
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getEnumDictionaryId() {
		return enumDictionaryId;
	}

	public void setEnumDictionaryId(int enumDictionaryId) {
		this.enumDictionaryId = enumDictionaryId;
	}
}

