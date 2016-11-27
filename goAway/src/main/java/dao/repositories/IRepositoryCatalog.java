package dao.repositories;

public interface IRepositoryCatalog {

	public IClientRepository Client();
	public IEmployeeRepository Employee();
	public IEnumDictionariesRepository Dictionaries();
	public IHotelRepository Hotel();
	public IPaymentRepository Payment();
	public ITourRepository Tour();
}
