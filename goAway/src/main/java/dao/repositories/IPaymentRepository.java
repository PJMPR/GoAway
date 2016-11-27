package dao.repositories;

import java.util.Date;
import java.util.List;

import domain.model.*;

public interface IPaymentRepository extends IRepository<Client>{

	public List<Payment> withDate(Date date);
	public List<Payment> withAmount(double amount);
	public List<Payment> byTour(Tour tour);
	public List<Payment> byTour(Employee employee);
	public List<Payment> byClient(Client client);
}

