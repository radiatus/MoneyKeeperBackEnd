package ru.vsu.dao;

import ru.vsu.expense.entity.Expense;

import java.util.ArrayList;
import java.util.List;

public class ExpenseDAO extends DAO<Expense> {
    public ExpenseDAO() {
        super();

    }

    @Override
    public List<Expense> findAll() {
        ArrayList<Expense> result = new ArrayList<>();

        return result;
    }

    @Override
    public Expense findById(Long id) {
        return new Expense() ;
    }

    @Override
    public void insert(Expense newEntity) {
    }

    @Override
    public void update(Long id, Expense changedEntity) {
    }

    @Override
    public void delete(Long id) {

    }
}
