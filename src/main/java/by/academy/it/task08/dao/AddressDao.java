package by.academy.it.task08.dao;

import by.academy.it.task08.entity.Address;
import org.hibernate.Criteria;

public interface AddressDao extends EntityDao<Address> {
    Address findByCriteria(Criteria criteria);
}
