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
        tour.setCountryFrom(rs.getString("country from"));
        tour.setCountryTo(rs.getString("country to"));
        tour.setAmountOfDays(rs.getInt("amount of days"));

        return tour;
    }
}