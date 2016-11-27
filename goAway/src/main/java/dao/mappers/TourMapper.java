package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import domain.model.*;

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
        tour.setPayment((Payment) rs.getObject("PAYMENT_ID"));
        tour.setClient((Client) rs.getObject("CLIENT_ID"));
        tour.setHotel((Hotel)rs.getObject("HOTEL_ID"));
        tour.setEmployee((Employee)rs.getObject("EMPLOYEE_ID"));
        tour.setEnumDictionary((EnumDictionary) rs.getObject("ENUM_DICTIONARY_ID"));

        return tour;
    }
}