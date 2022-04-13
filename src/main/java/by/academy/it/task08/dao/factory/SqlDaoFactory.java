package by.academy.it.task08.dao.factory;

import by.academy.it.task08.dao.AddressDao;
import by.academy.it.task08.dao.PeopleDao;
import by.academy.it.task08.dao.sqlimpl.AddressDaoImpl;
import by.academy.it.task08.dao.sqlimpl.PeopleDaoImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SqlDaoFactory extends DaoFactory {

    private final EntityManagerFactory factory;

    public SqlDaoFactory(String persistenceUnitName) {
        factory = Persistence.createEntityManagerFactory(persistenceUnitName);
    }

    public EntityManager getEntityManager() {
        return factory.createEntityManager();
    }

    public void closeEntityManager() {
        factory.close();
    }

    @Override
    public AddressDao getAddressDao() {
        return new AddressDaoImpl();
    }

    @Override
    public PeopleDao getPeopleDao() {
        return new PeopleDaoImpl();
    }
}
