package ru.vsu.expense.entity;

import java.util.Date;

import ru.vsu.category.entity.Category;
import ru.vsu.history.entity.HistoryItem;

public class Expense extends HistoryItem {
    private Category category;

    public Expense() {
    }

    public Expense(Long id, String name, Float value, Date date) {
        super(id, name, value, date);
    }

    public Expense(Long id, String name, Float value, Date date, Category category) {
        super(id, name, value, date);
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
