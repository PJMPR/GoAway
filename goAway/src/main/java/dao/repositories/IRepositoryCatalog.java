package dao.repositories;

import java.sql.SQLException;

public interface IRepositoryCatalog {

	public IClientRepository Client();
	public IEnumDictionariesRepository Dictionaries();
	public ITourRepository Tour();
	void save() throws SQLException;
}
