package ru.vsu.dao;

import java.util.ArrayList;
import java.util.List;

import ru.vsu.dao.DAO;
import ru.vsu.category.entity.Category;

public class CategoryDAO extends DAO<Category> {

    public CategoryDAO() {
        super();
    }

    @Override
    public List<Category> findAll() {
        ArrayList<Category> result = new ArrayList<>();

        return result;
    }

    @Override
    public Category findById(Long id) {
        return new Category();
    }

    @Override
    public void insert(Category newEntity) {
    }

    @Override
    public void update(Long id, Category changedEntity) {
    }

    @Override
    public void delete(Long id) {

    }
}
