package dao.repositories;

import java.util.List;

import domain.model.*;

public interface IEmployeeRepository extends IRepository<Client>{

	public List<Employee> withidentityNumber(String identityNumber);
	public List<Employee> byPayment(Payment payment);
	public List<Employee> byClient(Client client);
	public List<Employee> byTour(Tour tour);
}