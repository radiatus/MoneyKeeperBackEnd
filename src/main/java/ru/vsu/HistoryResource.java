package ru.vsu;

import ru.vsu.history.boundary.HistoryService;
import ru.vsu.history.entity.HistoryItem;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/history")
public class HistoryResource {

    @Inject
    private HistoryService historyService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<HistoryItem> getChannels() {
        return historyService.getAll();
    }
}
