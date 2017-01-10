package domain;

import dao.*;
import dao.repositories.IRepositoryCatalog;
import dao.uow.IUnitOfWork;
import dao.uow.UnitOfWork;
import domain.model.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Date;

public class App {
	
	public static void main(String[] args) {
    	
	    Client client = new Client();
     	client.setName("Jadwiga");
     	client.setSurname("Nowak");
     	client.setPassportNumber("123456789");
     	client.setTourId(0);
		
    	Client client2 = new Client();
    	
    	client2.setName("Jan");
    	client2.setSurname("Kowalski");
    	client2.setPassportNumber("987654321");
    	client2.setTourId(1);
    	
	    Client client3 = new Client();
    	
    	client3.setName("Jakub");
    	client3.setSurname("Malinowski");
    	client3.setPassportNumber("135790743");
    	client3.setTourId(2);
    	
    	EnumDictionary country = new EnumDictionary();
    	
    	country.setIntKey(1);
    	country.setStringKey("first");
    	country.setValue("country");
    	country.setEnumerationName("Italy");
    	
        EnumDictionary country2 = new EnumDictionary();
    	
    	country2.setIntKey(2);
    	country2.setStringKey("second");
    	country2.setValue("country");
    	country2.setEnumerationName("Spain");
    	
    	Tour tour = new Tour();
    	
    	tour.setName("Beach Tour to Spain");
		tour.setDateOfDeparture(new Date(116, 11, 13));
    	tour.setPrice(500.0);
    	tour.setCountryFrom("Poland");
    	tour.setCountryTo("Spain");
    	tour.setAmountOfDays(5);
    	tour.setEnumDictionaryId(0);
    	
    	Tour tour2 = new Tour();
    	
    	tour2.setName("Beach Tour to Italy");
		tour2.setDateOfDeparture(new Date(116, 11, 23));
    	tour2.setPrice(600.0);
    	tour2.setCountryFrom("Poland");
    	tour2.setCountryTo("Italy");
    	tour2.setAmountOfDays(6);
    	tour2.setEnumDictionaryId(1);
    	
        try {
            Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
            IUnitOfWork uow = new UnitOfWork(connection);
            IRepositoryCatalog catalog = new RepositoryCatalog(connection, uow);
            catalog.Dictionaries().add(country);
            catalog.Dictionaries().add(country2);
            catalog.save();
            catalog.Tour().add(tour);
            catalog.Tour().add(tour2);
            catalog.save();
            catalog.Client().add(client);
            catalog.Client().add(client2);
            catalog.Client().add(client3);
            catalog.save();
            
        connection.close();
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
