package by.academy.it.task08.dao.sqlimpl;

import by.academy.it.task08.dao.EntityDao;

import java.util.Map;

public class EntityDaoImpl<T> implements EntityDao<T> {
    @Override
    public T findById(Long id) {
        return null;
    }

    @Override
    public Map<Long, T> findAll() {
        return null;
    }

    @Override
    public void insert(T t) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Long id, T t) {

    }
}
