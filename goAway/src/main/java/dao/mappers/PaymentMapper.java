package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import domain.model.Payment;

public class PaymentMapper implements IMapResultSetIntoEntity {
	
    public Payment map(ResultSet rs) throws SQLException {
        Payment payment = new Payment();
        payment.setId(rs.getInt("id"));
        payment.setDate(rs.getDate("date"));
        payment.setAmount(rs.getInt("amount"));
        payment.setTourId(rs.getInt("TOUR_ID"));
        payment.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
        payment.setClientId(rs.getInt("CLIENT_ID"));

        return payment;
    }
}
