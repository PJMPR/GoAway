package dao.repositories;

import java.sql.SQLException;

import domain.model.Client;

public interface IRepositoryCatalog {

	public IClientRepository Client();
	public IEnumDictionariesRepository Dictionaries();
	public ITourRepository Tour();
	void save() throws SQLException;
	public Client getTour();
}
