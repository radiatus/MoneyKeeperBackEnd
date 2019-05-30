package ru.vsu.dao;

import java.util.List;

public abstract class DAO<T>{
    protected String tableName;
    protected List<String> attribute_names;

    public DAO() {

    }

    public abstract List<T> findAll();

    public abstract T findById(Long id);

    public abstract void insert(T newEntity);

    public abstract void update(Long id, T changedEntity);

    public abstract void delete(Long id);
}
