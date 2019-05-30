package ru.vsu.dao;


import ru.vsu.Income.entity.Income;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IncomeDAO extends DAO<Income>  {
    public IncomeDAO() {
        super();

    }


    @Override
    public List<Income> findAll() {
        ArrayList<Income> result = new ArrayList<>();

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date date;
        try {
            date = format.parse("15-04-2019");
            result.add(new Income(0L, "Взял взаймы", 1000F, date));
            date = format.parse("01-05-2019");
            result.add(new Income(1L, "Зарплата", 10000F, date));
        } catch (ParseException e){}

        return result;
    }

    @Override
    public Income findById(Long id) {
        return null;
    }

    @Override
    public void insert(Income newEntity) {
    }

    @Override
    public void update(Long id, Income changedEntity) {
    }

    @Override
    public void delete(Long id) {

    }
}
