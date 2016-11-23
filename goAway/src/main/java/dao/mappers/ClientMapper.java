package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.model.Client;

public class ClientMapper implements IMapResultSetIntoEntity {
	
    public Client map(ResultSet rs) throws SQLException {
        Client client = new Client();
        client.setId(rs.getInt("id"));
        client.setPassportNumber(rs.getString("passport number"));
        client.setPaymentId(rs.getInt("PAYMENT_ID"));
        client.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
        client.setTourId(rs.getInt("TOUR_ID"));

        return client;
    }
}
