package ru.vsu;

import ru.vsu.Income.boundary.IncomeService;
import ru.vsu.Income.entity.Income;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/incomes")
public class IncomeResource {
    @Inject
    private IncomeService incomeService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Income> getChannels() {
        return incomeService.getAll();
    }
}
