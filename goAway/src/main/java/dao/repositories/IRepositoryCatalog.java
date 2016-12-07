package dao.repositories;

public interface IRepositoryCatalog {

	public IClientRepository Client();
	public IEnumDictionariesRepository Dictionaries();
	public ITourRepository Tour();
}
