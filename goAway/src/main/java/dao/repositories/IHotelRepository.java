package dao.repositories;

import java.util.List;

import domain.model.*;

public interface IHotelRepository extends IRepository<Client>{

	public List<Hotel> withName(String name);
	public List<Hotel> withCategory(int category);
	public List<Hotel> byTour(Tour tour);
}