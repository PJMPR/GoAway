package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.*;
import domain.model.Client;

public class App {
    public static void main(String[] args) {
        try {
            Connection connection =
                    DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
            CountryRepository countryRepository = new CountryRepository(connection);
            EmployeeRepository employeeRepository = new EmployeeRepository(connection);
            HotelRepository hotelRepository = new HotelRepository(connection);
            ClientRepository clientRepository = new ClientRepository(connection);
            //MealRepository mealRepository = new MealRepository(connection);
            PaymentRepository paymentRepository = new PaymentRepository(connection);
            TourRepository tourRepository = new TourRepository(connection);
            
            Client janek = new Client();
            janek.setName("janek");
            janek.setSurname("kowalski");
            //spersonRepository.add(janek);
            Client janekFromDb = clientRepository.get(0);
            System.out.println(janekFromDb.getName() + " " + janekFromDb.getSurname());
            System.out.print("End");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
