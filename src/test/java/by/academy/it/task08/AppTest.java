package by.academy.it.task08;

import by.academy.it.task08.dao.AddressDao;
import by.academy.it.task08.dao.PeopleDao;
import by.academy.it.task08.dao.factory.DaoFactory;
import by.academy.it.task08.dao.factory.SqlDaoFactory;
import by.academy.it.task08.entity.Address;
import by.academy.it.task08.entity.People;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AppTest extends Assertions
{
    public static final long JAMES_BOND_ID = 4L;
    private static AddressDao addressDao;
    private static PeopleDao peopleDao;

    @BeforeAll
    static void beforeAll() {
        DaoFactory daoFactory = new SqlDaoFactory(DaoFactory.PersistenceUnit.TEST);

        addressDao = daoFactory.getAddressDao();

        Address address1 = Address.builder()
                .city("Minsk")
                .street("Kulman")
                .house("21a")
                .build();
        addressDao.save(address1);

        Address address2 = Address.builder()
                .city("New York")
                .street("Brighton Beach")
                .house("78")
                .build();
        addressDao.save(address2);
        Address address3 = Address.builder()
                .city("Minsk")
                .street("Krasnaya")
                .house("17")
                .build();
        addressDao.save(address3);
        Address address4 = Address.builder()
                .city("Chicago")
                .street("Baker")
                .house("190/1")
                .build();
        addressDao.save(address4);

        peopleDao = daoFactory.getPeopleDao();

        People people1 = People.builder()
                .surname("Ivanov")
                .name("Ivan")
                .patronymic("Ivanovich")
                .build();
        peopleDao.save(people1);

        People people2 = People.builder()
                .surname("Petrov")
                .name("Petr")
                .patronymic("Petrovich")
                .build();
        peopleDao.save(people2);
        People people3 = People.builder()
                .surname("Ivanov")
                .name("Aleksei")
                .patronymic("Kharitonovich")
                .build();
        peopleDao.save(people3);
        People people4 = People.builder()
                .surname("Bond")
                .name("James")
                .patronymic("Londonovich")
                .build();
        peopleDao.save(people4);
    }
    @Test
    public void shouldAnswerWithTrue()
    {
        System.out.println(addressDao.findAll());
        System.out.println(peopleDao.findAll());
        assertTrue( true );
    }

    @Test
    public void shouldFindJamesBond(){
        People persistenceBond = peopleDao.findById(JAMES_BOND_ID);
        People hardCoreBond = People.builder()
                .id(4L)
                .surname("Bond")
                .name("James")
                .patronymic("Londonovich")
                .build();
        assertEquals(hardCoreBond, persistenceBond);
    }

}
