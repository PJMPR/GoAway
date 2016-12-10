package domain;

import dao.*;
import dao.mappers.ClientMapper;
import dao.mappers.EnumDictionaryMapper;
import dao.mappers.TourMapper;
import dao.repositories.IRepositoryCatalog;
import dao.uow.IUnitOfWork;
import dao.uow.UnitOfWork;
import domain.model.Client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
    	
    	Client client = new Client();
    	
    	client.setId(0);
    	client.setName("Agnieszka");
    	client.setSurname("Nowak");
    	client.setPassportNumber("123456789");
    	
    	Client client2 = new Client();
    	
     	client.setId(0);
    	client.setName("Jan");
    	client.setSurname("Kowalski");
    	client.setPassportNumber("987654321");
    	
        try {
            Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
            IUnitOfWork uow = new UnitOfWork(connection);
            IRepositoryCatalog catalog = new RepositoryCatalog(connection, uow);
            catalog.Client().add(client);
            catalog.save();
            
        connection.close();
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
