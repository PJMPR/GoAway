package dao.repositories;

import java.util.Date;
import java.util.List;

import domain.model.*;

public interface ITourRepository extends IRepository<Tour>{

	public List<Tour> withName(String name);
	public List<Tour> withDateOfDeparture(java.sql.Date dateOfDeparture);
	public List<Tour> withPrice(double price);
	public List<Tour> withCoutryFrom(String countryFrom);
	public List<Tour> withCoutryTo(String countryTo);
	public List<Tour> withAmountOfDays(int amountOfDays);
}