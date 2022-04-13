package by.academy.it.task08.dao;

import java.util.Map;

public interface EntityDao <T>{
    T findById(Long id);
    Map<Long,T> findAll();
    void insert(T t);
    void delete(Long id);
    void update(Long id, T t);
}
