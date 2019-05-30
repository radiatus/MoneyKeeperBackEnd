package ru.vsu.history.boundary;


import ru.vsu.category.boundary.CategoryService;
import ru.vsu.expense.boundary.ExpenseService;
import ru.vsu.expense.entity.Expense;
import ru.vsu.history.entity.HistoryItem;
import ru.vsu.Income.boundary.IncomeService;
import ru.vsu.Income.entity.Income;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class HistoryService {
    private IncomeService incomeService;
    private ExpenseService expenseService;
    private CategoryService categoryService;

    public HistoryService() {
        incomeService = new IncomeService();
        expenseService = new ExpenseService();
        categoryService = new CategoryService();
    }

    public List<HistoryItem> getAll(){
        List<HistoryItem> result = new ArrayList<>();
        for (Income income: incomeService.getAll()) {
            result.add(income);
        }

        for (Expense expense: expenseService.getAll()) {
            result.add(expense);
        }

        Collections.sort(result, new Comparator<HistoryItem>() {
            @Override
            public int compare(HistoryItem o1, HistoryItem o2) {
                int val = o2.getDate().compareTo(o1.getDate());
                return val;
            }
        });

        return result;
    }

    public void deleteItem(HistoryItem item){
        if (item instanceof Expense) {
            expenseService.delete(item.getId());
        } else {
            incomeService.delete(item.getId());
        }
    }


    public List<HistoryItem> getLast(Date lastTime){
        return null;
    }

    public List<HistoryItem> getInInterval(Date startTime, Date endTime){
        return null;
    }

}
