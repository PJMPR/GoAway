package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.model.*;

public class EmployeeMapper implements IMapResultSetIntoEntity {
	
    public Employee map(ResultSet rs) throws SQLException {
        Employee employee = new Employee();
        employee.setId(rs.getInt("id"));
        employee.setIdentityNumber(rs.getString("identity number"));
        employee.setPayment((Payment)rs.getObject("PAYMENT_ID"));
        employee.setClient((Client)rs.getObject("CLIENT_ID"));
        employee.setTour((Tour)rs.getObject("TOUR_ID"));
        
        return employee;
    }
}


