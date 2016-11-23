package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import domain.model.Tour;
import domain.model.EnumDictionary;

public class TourMapper implements IMapResultSetIntoEntity {
	
    public Tour map(ResultSet rs) throws SQLException {
        Tour tour = new Tour();
        EnumDictionary dictionary = new EnumDictionary();
        tour.setId(rs.getInt("id"));
        tour.setName(rs.getString("name"));
        tour.setDateOfDeparture(rs.getDate("date of departure"));
        tour.setPrice(rs.getDouble("price"));
        tour.setCityOfDeparture(rs.getString("city of departures"));
        tour.setAmountOfDays(rs.getInt("amount of days"));
        tour.setPaymentId(rs.getInt("PAYMENT_ID"));
        tour.setClientId(rs.getInt("CLIENT_ID"));
        tour.setHotelId(rs.getInt("HOTEL_ID"));
        tour.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
        dictionary.setId(rs.getInt("COUNTRY_ID"));
        dictionary.setId(rs.getInt("MEAL_ID"));

        return tour;
    }
}