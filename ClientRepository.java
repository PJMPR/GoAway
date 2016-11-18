package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.model.Client;

public class ClientRepository extends RepositoryBase{
	
	String insertSql = "INSERT INTO client(name, surname, passportNumber) VALUES (?,?,?)";
	String selectByIdSql = "SELECT * FROM client WHERE id=?";
	String updateByIdSql = "UPDATE client SET NAME=? WHERE id=?";
	String deleteByIdSql = "DELETE FROM client where id=?";
	String getAllSql = "SELECT * FROM client";
	
	PreparedStatement insert;
	PreparedStatement selectById;
	PreparedStatement updateById;
	PreparedStatement deleteById;
	static PreparedStatement getAll; 
	
	public ClientRepository(Connection connection) {
		super(connection);
		try {
			insert = connection.prepareStatement(insertSql);
			selectById = connection.prepareStatement(selectByIdSql);
			updateById = connection.prepareStatement(updateByIdSql);
			deleteById = connection.prepareStatement(deleteByIdSql);
			getAll = connection.prepareStatement(getAllSql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Client get(int clientId){
		try{
			selectById.setInt(1, clientId);
			ResultSet rs = selectById.executeQuery();
			while(rs.next()){
				Client result = new Client();
				result.setId(rs.getInt("id"));
				result.setName(rs.getString("name"));
				result.setSurname(rs.getString("surname"));
				result.setPassportNumber(rs.getString("passportNumber"));
				return result;
			}
		}
		catch(SQLException ex){
			ex.printStackTrace();
		}
		return null;
	}
	
	public void add(Client client) {
		try {
			insert.setString(1, client.getName());
			insert.setString(2, client.getSurname());
			insert.setString(2, client.getPassportNumber());
			insert.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public void update(Client client){
		 try {
			updateById.setString(1, client.getName());
		    updateById.setString(2, client.getSurname());
		    updateById.setString(3, client.getPassportNumber());
		} catch (SQLException e) {
		      e.printStackTrace();
		}
}
	
	public void delete(Client client){
		try{
		    deleteById.setInt(1, client.getId());
		}catch(Exception e) {
			  e.printStackTrace();
		}
}
	
	public static List <Client> getAll(){
		List <Client> list = new ArrayList<Client>();
		try{
			ResultSet rs = getAll.executeQuery();
			while(rs.next()){
				Client result = new Client();
				result.setId(rs.getInt(1));
				result.setName(rs.getString(2));
				result.setSurname(rs.getString(3));
				result.setPassportNumber(rs.getString(4));
				list.add(result);
			}
	}catch(Exception e)
		{e.printStackTrace();}
		return list;
	}

	@Override
	protected String createTableSql() {
		return "" + "CREATE TABLE client("
				+ "id bigint GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,"
				+ "name varchar(20)," + "surname varchar(50)" + "passportNumber varchar(9),"
				+ "FOREIGN KEY (PAYMENT_ID) REFERENCES payment(id),"
		        + "FOREIGN KEY (EMPLOYEE_ID) REFERENCES employee(id),"
		        + "FOREIGN KEY (TOUR_ID) REFERENCES tour(id)," + ")";		
	}

	@Override
	protected String tableName() {
		return "client";
	}
}
