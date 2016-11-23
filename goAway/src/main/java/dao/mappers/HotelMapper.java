package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.model.Hotel;

public class HotelMapper implements IMapResultSetIntoEntity {
	
    public Hotel map(ResultSet rs) throws SQLException {
        Hotel hotel = new Hotel();
        hotel.setId(rs.getInt("id"));
        hotel.setName(rs.getString("name"));
        hotel.setCategory(rs.getInt("category"));
        hotel.setTourId(rs.getInt("TOUR_ID"));

        return hotel;
    }
}
