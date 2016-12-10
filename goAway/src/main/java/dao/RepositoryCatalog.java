package dao;

import dao.mappers.EnumDictionaryMapper;
import dao.mappers.ClientMapper;
import dao.mappers.TourMapper;
import dao.mappers.EnumDictionaryMapper;
import dao.repositories.*;
import dao.uow.IUnitOfWork;

import java.sql.Connection;

public class RepositoryCatalog implements IRepositoryCatalog {

	private Connection connection;
	private IUnitOfWork uow;

	public RepositoryCatalog(Connection connection, IUnitOfWork uow) {
		super();
		this.connection = connection;
		this.uow = uow;
	}

	public IClientRepository Client() {
		return new ClientRepository(connection, new ClientMapper(), uow);
	}

	/*public IEnumDictionariesRepository Dictionaries() {
		return new EnumDictionaryRepository(connection, new EnumDictionaryMapper(), uow);
	}

	public ITourRepository Tour() {
		return new TourRepository(connection, new TourMapper(), uow);
	}*/

	public void save() {
		uow.saveChanges();
	}

	public IEnumDictionariesRepository Dictionaries() {
		// TODO Auto-generated method stub
		return null;
	}

	public ITourRepository Tour() {
		// TODO Auto-generated method stub
		return null;
	}
}
