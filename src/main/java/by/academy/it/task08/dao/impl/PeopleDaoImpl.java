package by.academy.it.task08.dao.impl;

import by.academy.it.task08.dao.PeopleDao;
import by.academy.it.task08.entity.People;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 *
 */
public class PeopleDaoImpl extends EntityDaoImpl<People> implements PeopleDao {
    /**
     * @param factory
     * @param aClass
     */
    public PeopleDaoImpl(final EntityManagerFactory factory,
                         final Class<People> aClass) {
        super(factory, aClass);
    }

    /**
     * @param surname
     * @return
     */
    @Override
    public List<People> findBySurname(final String surname) {
        EntityManager entityManager = super.getFactory().createEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<People> criteriaQuery =
                criteriaBuilder.createQuery(People.class);
        Root<People> itemRoot = criteriaQuery.from(People.class);
        Predicate predicate
                = criteriaBuilder.equal(itemRoot.get("surname"), surname);
        criteriaQuery.where(predicate);
        return entityManager.createQuery(criteriaQuery).getResultList();
    }
}
