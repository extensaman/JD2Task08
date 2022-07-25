package by.academy.it.task08.dao;

import java.util.List;

/**
 * @param <T>
 */
public interface EntityDao<T> {
    /**
     * @param id
     * @return -
     */
    T findById(Long id);

    /**
     * @return -
     */
    List<T> findAll();

    /**
     * @param t
     */
    void save(T t);

    /**
     * @param t
     */
    void update(T t);

    /**
     * @param id
     */
    void delete(Long id);
}
