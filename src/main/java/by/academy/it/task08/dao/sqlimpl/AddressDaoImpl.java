package by.academy.it.task08.dao.sqlimpl;

import by.academy.it.task08.dao.AddressDao;
import by.academy.it.task08.entity.Address;
import org.hibernate.Criteria;

public class AddressDaoImpl extends EntityDaoImpl<Address> implements AddressDao {
    @Override
    public Address findByCriteria(Criteria criteria) {
        return null;
    }
}
