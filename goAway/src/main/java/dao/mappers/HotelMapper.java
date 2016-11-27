package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.model.*;

public class HotelMapper implements IMapResultSetIntoEntity {
	
    public Hotel map(ResultSet rs) throws SQLException {
        Hotel hotel = new Hotel();
        hotel.setId(rs.getInt("id"));
        hotel.setName(rs.getString("name"));
        hotel.setCategory(rs.getInt("category"));
        hotel.setTour((Tour)rs.getObject("TOUR_ID"));

        return hotel;
    }
}
