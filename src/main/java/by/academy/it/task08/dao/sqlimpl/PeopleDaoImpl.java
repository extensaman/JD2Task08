package by.academy.it.task08.dao.sqlimpl;

import by.academy.it.task08.dao.PeopleDao;
import by.academy.it.task08.entity.People;
import org.hibernate.Criteria;

public class PeopleDaoImpl extends EntityDaoImpl<People> implements PeopleDao {
    @Override
    public People findByCriteria(Criteria criteria) {
        return null;
    }
}
