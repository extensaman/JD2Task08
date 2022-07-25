package by.academy.it.task08.dao;

import by.academy.it.task08.entity.Address;

import java.util.List;

/**
 *
 */
public interface AddressDao extends EntityDao<Address> {
    /**
     * @param city
     * @return -
     */
    List<Address> findByCity(String city);
}
