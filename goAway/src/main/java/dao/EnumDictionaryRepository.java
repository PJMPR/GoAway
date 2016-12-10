package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.mappers.IMapResultSetIntoEntity;
import dao.repositories.IEnumDictionariesRepository;
import dao.uow.IUnitOfWork;
import domain.model.EnumDictionary;
import domain.model.Country;

public class EnumDictionaryRepository extends RepositoryBase<EnumDictionary> implements IEnumDictionariesRepository {

	protected EnumDictionaryRepository(Connection connection, IMapResultSetIntoEntity<EnumDictionary> mapper,
			IUnitOfWork uow) {
		super(connection, mapper, uow);
		// TODO Auto-generated constructor stub
	}

	public List<EnumDictionary> withDictionaryName(String enumName) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EnumDictionary> getEnumValues(String enumName, String stringKey) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EnumDictionary> getEnumValues(String enumName, int intKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String insertSql() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String updateSql() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setUpdate(EnumDictionary entity) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void setInsert(EnumDictionary entity) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected String createTableSql() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String tableName() {
		// TODO Auto-generated method stub
		return null;
	}

	/*public EnumDictionaryRepository(Connection connection, IMapResultSetIntoEntity<EnumDictionary> mapper) {
		super(connection, mapper);
	}

	@Override
	protected String createTableSql() {
		return "CREATE TABLE enumDictionary("
				+ "id bigint GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,"
				+ "intKey bigint," 
				+ "stringKey varchar(50),"
				+ "value varchar(50)," 
				+ "enumerationName varchar(50)" 
				+ ")";
	}

	@Override
	protected String tableName() {
		return "enumDictionary";
	}

	protected String insertSql() {
		return "INSERT INTO enumDictionary(intKey, stringKey, value, enumerationName) VALUES (?,?,?,?)";
	}

	protected String updateSql() {
		return "UPDATE enumDictionary SET (intKey, stringKey, value, enumerationName)=(?,?,?,?) WHERE id=?";
	}

	@Override
	protected void setUpdate(EnumDictionary entity) throws SQLException {
		update.setInt(1, entity.getIntKey());
		update.setString(2, entity.getStringKey());
		update.setString(3, entity.getValue());
		update.setString(4, entity.getEnumerationName());	
	}

	@Override
	protected void setInsert(EnumDictionary entity) throws SQLException {
		insert.setInt(1, entity.getIntKey());
		insert.setString(2, entity.getStringKey());
		insert.setString(3, entity.getValue());
		insert.setString(4, entity.getEnumerationName());
	}

	public List<EnumDictionary> withDictionaryName(String enumName) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EnumDictionary> getEnumValues(String enumName, String stringKey) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EnumDictionary> getEnumValues(String enumName, int intKey) {
		// TODO Auto-generated method stub
		return null;
	}*/
}

