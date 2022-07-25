package by.academy.it.task08.dao.factory;

import by.academy.it.task08.dao.AddressDao;
import by.academy.it.task08.dao.PeopleDao;
import by.academy.it.task08.dao.impl.AddressDaoImpl;
import by.academy.it.task08.dao.impl.PeopleDaoImpl;
import by.academy.it.task08.entity.Address;
import by.academy.it.task08.entity.People;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 */
public class SqlDaoFactory implements DaoFactory {

    /**
     *
     */
    private final EntityManagerFactory factory;

    /**
     * @param unit
     */
    public SqlDaoFactory(final DaoFactory.PersistenceUnit unit) {
        factory = Persistence
                .createEntityManagerFactory(unit.getPersistenceUtitName());
    }

    /**
     * @return -
     */
    @Override
    public AddressDao getAddressDao() {
        return new AddressDaoImpl(factory, Address.class);
    }

    /**
     * @return -
     */
    @Override
    public PeopleDao getPeopleDao() {
        return new PeopleDaoImpl(factory, People.class);
    }
}
