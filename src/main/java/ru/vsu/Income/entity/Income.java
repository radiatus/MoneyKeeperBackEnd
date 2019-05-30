package ru.vsu.Income.entity;

import java.util.Date;

import ru.vsu.history.entity.HistoryItem;

public class Income extends HistoryItem {

    public Income() {
    }

    public Income(Long id, String name, Float value, Date date) {
        super(id, name, value, date);
    }

}
