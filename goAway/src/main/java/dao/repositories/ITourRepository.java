package dao.repositories;

import java.util.Date;
import java.util.List;

import domain.model.*;

public interface ITourRepository extends IRepository<Client>{

	public List<Client> withName(String name);
	public List<Client> withDate(Date Date);
	public List<Client> withPrice(double price);
	public List<Client> withCoutryFrom(String countryFrom);
	public List<Client> withCoutryTo(String countryTo);
	public List<Client> withAmountOfDays(int amountOfDays);
}