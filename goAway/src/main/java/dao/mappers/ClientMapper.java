package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.model.*;

public class ClientMapper implements IMapResultSetIntoEntity {
	
    public Client map(ResultSet rs) throws SQLException {
        Client client = new Client();
        client.setId(rs.getInt("id"));
        client.setPassportNumber(rs.getString("passport number"));
        client.setTour((Tour)rs.getObject("TOUR_ID"));

        return client;
    }
}

