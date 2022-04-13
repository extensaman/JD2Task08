package by.academy.it.task08.dao;

import by.academy.it.task08.entity.People;
import org.hibernate.Criteria;

public interface PeopleDao extends EntityDao<People> {
    People findByCriteria(Criteria criteria);
}
