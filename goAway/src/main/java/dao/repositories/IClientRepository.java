package dao.repositories;

import java.util.Date;
import java.util.List;

import domain.model.Client;
import domain.model.Payment;

public interface IClientRepository extends IRepository<Client>{
	
	public List<Client> of(Payment payment);
	public List<History> ofType(Operation operation);
	public List<History> withDate(Date from, Date to);

}
