package by.academy.it.task08.dao.factory;

import by.academy.it.task08.dao.AddressDao;
import by.academy.it.task08.dao.PeopleDao;

public abstract class DaoFactory {
    enum DaoForm {
        JPA, FILE;
    }
    public abstract AddressDao getAddressDao();

    public abstract PeopleDao getPeopleDao();

    public static DaoFactory getDaoFactory(DaoForm form) {
        switch (form){
            case JPA:
                return new SqlDaoFactory(String persistenceUnitName);
            case FILE:
                return new FileDaoFactory();
            default:
                throw new IllegalArgumentException();
        }
    }
}
