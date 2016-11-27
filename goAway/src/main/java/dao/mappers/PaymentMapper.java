package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import domain.model.*;

public class PaymentMapper implements IMapResultSetIntoEntity {
	
    public Payment map(ResultSet rs) throws SQLException {
        Payment payment = new Payment();
        payment.setId(rs.getInt("id"));
        payment.setDate(rs.getDate("date"));
        payment.setAmount(rs.getInt("amount"));
        payment.setTour((Tour)rs.getObject("TOUR_ID"));
        payment.setEmployee((Employee)rs.getObject("EMPLOYEE_ID"));
        payment.setClient((Client)rs.getObject("CLIENT_ID"));

        return payment;
    }
}
