package dao;

import dao.mappers.IMapResultSetIntoEntity;
import dao.repositories.IClientRepository;
import dao.uow.IUnitOfWork;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.model.Client;
import domain.model.Tour;

public class ClientRepository extends RepositoryBase<Client> implements IClientRepository{
	
    private PreparedStatement getName;
    private PreparedStatement getSurname;
    private PreparedStatement getPassportNumber;
    private PreparedStatement getTour;

	public ClientRepository(Connection connection,
			IMapResultSetIntoEntity<Client> mapper, IUnitOfWork uow) {
		super(connection, mapper, uow);

		try{
		    getName = connection.prepareStatement(getNameSql());
		    getSurname = connection.prepareStatement(getSurnameSql());
		    getPassportNumber = connection.prepareStatement(getPassportNumberSql());
		    getTour = connection.prepareStatement(getTourSql());
        }catch(SQLException e){
		    e.printStackTrace();
        }
	}
	
	@Override
	protected String createTableSql() {
		return "" + "CREATE TABLE client("
				+ "id bigint GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,"
				+ "name varchar(20),"
				+ "surname varchar(50),"
				+ "passportNumber varchar(9),"
                + "tour_id bigint,"
                + "foreign key (tour_id) references tour(id));";
    }
	
	@Override
	protected String tableName() {
		return "client";
	}

	protected String insertSql() {
		return "INSERT INTO client(name, surname, passportNumber, tour_id) VALUES (?,?,?,?)";
	}

	protected String updateSql() {
		return "UPDATE CLIENT SET (name, surname, passportNumber,tour_id)= (?,?,?,?) WHERE id = ?";
	}

	protected String getNameSql(){return "SELECT * FROM client where name = ?";}
	protected String getSurnameSql(){return "SELECT * FROM client where surname=?";}
	protected String getPassportNumberSql(){return "SELECT * FROM client where passportNumber=?";}
	protected String getTourSql(){return "SELECT * FROM client where tour_id=?";}

    @Override
    protected void setUpdate(Client entity) throws SQLException {
        update.setString(1, entity.getName());
        update.setString(2, entity.getSurname());
        update.setString(3, entity.getPassportNumber());
        update.setInt(4, entity.getTourId());
    }

    @Override
    protected void setInsert(Client entity) throws SQLException {
        insert.setString(1, entity.getName());
        insert.setString(2, entity.getSurname());
        insert.setString(3, entity.getPassportNumber());
        insert.setInt(4, entity.getTourId());
}

    public List<Client> withName(String name) {
    	 List<Client> client = new ArrayList<Client>();
         try{
             getName.setString(1,name);
             ResultSet resultSet = getName.executeQuery();
             while(resultSet.next()){
                 client.add(mapper.map(resultSet));
             }
         }catch (SQLException e){
             e.printStackTrace();
         }
         return client;
    }


    public List<Client> withSurname(String surname) {
    	 List<Client> client = new ArrayList<Client>();
         try{
             getSurname.setString(1,surname);
             ResultSet resultSet = getSurname.executeQuery();
             while(resultSet.next()){
                 client.add(mapper.map(resultSet));
             }
         }catch (SQLException e){
             e.printStackTrace();
         }
         return client;
    }
    
    public List<Client> withPassportNumber(String passportNumber) {
   	 List<Client> client = new ArrayList<Client>();
        try{
            getPassportNumber.setString(1,passportNumber);
            ResultSet resultSet = getPassportNumber.executeQuery();
            while(resultSet.next()){
                client.add(mapper.map(resultSet));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return client;
	}

	public List<Tour> byClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}
}
