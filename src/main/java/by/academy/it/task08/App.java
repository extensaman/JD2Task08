package by.academy.it.task08;

import by.academy.it.task08.dao.AddressDao;
import by.academy.it.task08.dao.PeopleDao;
import by.academy.it.task08.dao.factory.DaoFactory;
import by.academy.it.task08.dao.factory.SqlDaoFactory;
import by.academy.it.task08.entity.Address;
import by.academy.it.task08.entity.People;

/**
 * Connect to project jacoco plugin, checkstyle plugin,
 * write tests, use hibernate.
 * Add entities: Address(id, city, street, house) and
 * People (id, first name, last name, patronymic)
 * from the main method add, read, change and delete data in these tables
 */

public final class App {
    private App() {

    }

    /**
     * @param args
     */
    public static void main(final String[] args) {
        DaoFactory daoFactory =
                new SqlDaoFactory(DaoFactory.PersistenceUnit.PRODUCTION);

        Address address = Address.builder()
                .city("Minsk")
                .street("Lesnaya")
                .house("21a")
                .build();

        AddressDao addressDao = daoFactory.getAddressDao();

        addressDao.save(address);
        Address address1 = addressDao.findById(1L);
        System.out.println(address1);
        address.setCity("New York");
        addressDao.update(address);
        address1 = addressDao.findById(1L);
        System.out.println(address1);
        addressDao.delete(1L);

        PeopleDao peopleDao = daoFactory.getPeopleDao();

        People people = People.builder()
                .surname("Sidorov")
                .name("Sidr")
                .patronymic("Sidorovich")
                .build();
        peopleDao.save(people);
        People people1 = peopleDao.findById(1L);
        System.out.println(people1);
        people.setSurname("Kozlov");
        peopleDao.update(people);
        people1 = peopleDao.findById(1L);
        System.out.println(people1);
        peopleDao.delete(1L);
    }
}
