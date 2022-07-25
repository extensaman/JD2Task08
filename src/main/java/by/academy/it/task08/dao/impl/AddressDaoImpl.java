package by.academy.it.task08.dao.impl;

import by.academy.it.task08.dao.AddressDao;
import by.academy.it.task08.entity.Address;

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
public class AddressDaoImpl extends EntityDaoImpl<Address>
                        implements AddressDao {
    /**
     * @param factory
     * @param aClass
     */
    public AddressDaoImpl(final EntityManagerFactory factory,
                          final Class<Address> aClass) {
        super(factory, aClass);
    }

    /**
     * @param city
     * @return -
     */
    @Override
    public List<Address> findByCity(final String city) {
        EntityManager entityManager = super.getFactory().createEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Address> criteriaQuery =
                criteriaBuilder.createQuery(Address.class);
        Root<Address> itemRoot = criteriaQuery.from(Address.class);
        Predicate predicate
                = criteriaBuilder.equal(itemRoot.get("city"), city);
        criteriaQuery.where(predicate);
        return entityManager.createQuery(criteriaQuery).getResultList();
    }
}
