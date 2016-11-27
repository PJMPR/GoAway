package dao.repositories;

import java.util.Date;
import java.util.List;

import domain.model.*;

public interface ITourRepository extends IRepository<Client>{

	public List<Client> withName(String name);
	public List<Client> withDate(Date Date);
	public List<Client> withPrice(double price);
	public List<Client> withCityOfDeparture(String cityOfDeparture);
	public List<Client> withAmountOfDays(int amountOfDays);
	public List<Client> byPayment(Payment payment);
	public List<Client> byClient(Client client);
	public List<Client> byHotel(Hotel hotel);
	public List<Client> byEmployee(Employee employee);
	public List<Client> byEnumDictionary(EnumDictionary EnumDictionary);
}