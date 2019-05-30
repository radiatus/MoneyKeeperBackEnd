package ru.vsu.category.boundary;


import java.util.List;

import ru.vsu.category.entity.Category;
import ru.vsu.dao.CategoryDAO;

public class CategoryService {
    private CategoryDAO dao;

    public CategoryService() {
        dao = new CategoryDAO();
    }

    public List<Category> getAll(){
        return dao.findAll();
    }

    public Category get(Long id){
        return dao.findById(id);
    }

    public void delete(Long Id){
    }

    public void add(Category category){
        dao.insert(category);
    }

    public void update(Category category){
        dao.update(category.getId(), category);
    }
}
