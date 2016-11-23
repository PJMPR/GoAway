package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.model.Employee;

public class EmployeeMapper implements IMapResultSetIntoEntity {
	
    public Employee map(ResultSet rs) throws SQLException {
        Employee employee = new Employee();
        employee.setId(rs.getInt("id"));
        employee.setIdentityNumber(rs.getString("identity number"));
        employee.setPaymentId(rs.getInt("PAYMENT_ID"));
        employee.setClientId(rs.getInt("CLIENT_ID"));
        employee.setTourId(rs.getInt("TOUR_ID"));

        return employee;
    }
}

