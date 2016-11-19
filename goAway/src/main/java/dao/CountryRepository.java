package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.model.Country;

public class CountryRepository extends RepositoryBase{
	
	String insertSql = "INSERT INTO country(name) VALUES (?)";
	String selectByIdSql = "SELECT * FROM country WHERE id=?";
	String updateByIdSql = "UPDATE country SET ID=? WHERE id=?";
	String deleteByIdSql = "DELETE FROM country where id=?";
	String getAllSql = "SELECT * FROM country";
		
	PreparedStatement insert;
	PreparedStatement selectById;
	PreparedStatement updateById;
	PreparedStatement deleteById;
	static PreparedStatement getAll; 
	
	public CountryRepository(Connection connection) {
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
	
	public void update(Country country){
		 try {
			updateById.setInt(1, country.getId());
		} catch (SQLException e) {
		      e.printStackTrace();
		}
}
	
	public void delete(Country country){
		try{
		    deleteById.setInt(1, country.getId());
		}catch(Exception e) {
			  e.printStackTrace();
		}
}
	
	public static List <Country> getAll(){
		List <Country> list = new ArrayList<Country>();
		try{
			ResultSet rs = getAll.executeQuery();
			while(rs.next()){
				Country result = new Country();
				result.setId(rs.getInt(1));
				result.setName(rs.getString(2));
				list.add(result);
			}
	}catch(Exception e)
		{e.printStackTrace();}
		return list;
	}

	@Override
	protected String createTableSql() {
		return "CREATE TABLE country("
				+ "id bigint GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY ,"
				+ "name varchar(20),"
				+ "FOREIGN KEY (TOUR_ID) REFERENCES tour(id)," + ")";
	}

	@Override
	protected String tableName() {
		return "country";
	}
}

