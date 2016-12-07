package domain;

import dao.*;
import dao.mappers.ClientMapper;
import dao.mappers.EnumDictionaryMapper;
import dao.mappers.TourMapper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        try {
            Connection connection =
                    DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
            ClientRepository repo = new ClientRepository(connection, new ClientMapper() );
            TourRepository repo2 = new TourRepository(connection, new TourMapper() );
            EnumDictionaryRepository repo3 = new EnumDictionaryRepository(connection, new EnumDictionaryMapper() );
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
