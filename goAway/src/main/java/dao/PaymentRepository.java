package dao;

import dao.mappers.IMapResultSetIntoEntity;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

import domain.model.Payment;

public class PaymentRepository extends RepositoryBase<Payment>{
	
	public PaymentRepository(Connection connection, IMapResultSetIntoEntity<Payment> mapper) {
        super(connection, mapper);
    }

	@Override
	protected String createTableSql() {
		return "" + "CREATE TABLE payment("
				+ "id bigint GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,"
				+ "date date," + "amount int,"
				+ "FOREIGN KEY (TOUR_ID) REFERENCES tour(id),"
		        + "FOREIGN KEY (EMPLOYEE_ID) REFERENCES employee(id),"
		        + "FOREIGN KEY (CLIENT_ID) REFERENCES client(id)," + ")";		
	}

    @Override
    protected String tableName() {
        return "payment";
    }

    @Override
    protected String insertSql() {
        return "INSERT INTO payment("
                + "date, amount,"
                + "TOUR_ID,"
                + "EMPLOYEE_ID,"
                + "CLIENT_ID"
                + ") VALUES (?,?,?,?,?)";
    }

    @Override
    protected String updateSql() {
        return "UPDATE PAYMENT SET (date, amount, TOUR_ID" +
                ", EMPLOYEE_ID, CLIENT_ID)= (?,?,?,?,?) WHERE id = ?";
    }

    @Override
    protected void setUpdate(Payment entity) throws SQLException {
        update.setDate(1, (Date) entity.getDate());
        update.setDouble(2, entity.getAmount());
        update.setInt(4, entity.getTour().getId());
        update.setInt(5, entity.getEmployee().getId());
        update.setInt(6, entity.getClient().getId());
    }

    @Override
    protected void setInsert(Payment entity) throws SQLException {
        insert.setDate(1, (Date) entity.getDate());
        insert.setDouble(2, entity.getAmount());
        insert.setInt(4, entity.getTour().getId());
        insert.setInt(5, entity.getEmployee().getId());
        insert.setInt(6, entity.getClient().getId());
	}
}

