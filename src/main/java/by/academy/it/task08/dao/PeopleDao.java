package by.academy.it.task08.dao;

import by.academy.it.task08.entity.People;

import java.util.List;

/**
 *
 */
public interface PeopleDao extends EntityDao<People> {

    /**
     * @param surname
     * @return -
     */
    List<People> findBySurname(String surname);
}
