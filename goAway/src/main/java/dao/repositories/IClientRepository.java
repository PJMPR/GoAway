package dao.repositories;

import java.util.List;

import domain.model.*;

public interface IClientRepository extends IRepository<Client>{

	public List<Client> withPassportNumber(String passportNumber);
	public List<Client> byPayment(Payment payment);
	public List<Client> byEmployee(Employee employee);
	public List<Client> byTour(Tour tour);
}
