package domain;

import java.text.SimpleDateFormat;

import dao.*;
import dao.mappers.ClientMapper;
import dao.mappers.EnumDictionaryMapper;
import dao.mappers.TourMapper;
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
    	
    	Client client2 = new Client();
    	
    	client2.setName("Jan");
    	client2.setSurname("Kowalski");
    	client2.setPassportNumber("987654321");
    	
	    Client client3 = new Client();
    	
    	client3.setName("Jakub");
    	client3.setSurname("Malinowski");
    	client3.setPassportNumber("135790743");
    	
    	EnumDictionary country = new EnumDictionary();
    	
    	country.setIntKey(1);
    	country.setStringKey("first");
    	country.setValue("country");
    	country.setEnumerationName("Italy");
    	
    	Tour tour = new Tour();
    	
    	tour.setName("Beach Tour to Spain");
		tour.setDateOfDeparture(new Date(116, 15, 12));
    	tour.setPrice(500);
    	tour.setCountryFrom("Poland");
    	tour.setCountryTo("Spain");
    	tour.setAmountOfDays(5);
    	
        try {
            Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
            IUnitOfWork uow = new UnitOfWork(connection);
            IRepositoryCatalog catalog = new RepositoryCatalog(connection, uow);
            catalog.Client().add(client);
            catalog.Client().add(client2);
            catalog.Client().add(client3);
            catalog.save();
            catalog.Dictionaries().add(country);
            catalog.save();
            catalog.Tour().add(tour);
            catalog.save();

            
        connection.close();
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
