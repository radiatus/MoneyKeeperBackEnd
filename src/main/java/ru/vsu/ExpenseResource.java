package ru.vsu;

import ru.vsu.expense.boundary.ExpenseService;
import ru.vsu.expense.entity.Expense;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/incomes")
public class ExpenseResource {
    @Inject
    private ExpenseService expenseService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Expense> getChannels() {
        return expenseService.getAll();
    }
}
