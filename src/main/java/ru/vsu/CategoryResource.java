package ru.vsu;

import ru.vsu.category.boundary.CategoryService;
import ru.vsu.category.entity.Category;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/categories")
public class CategoryResource {
    @Inject
    private CategoryService categoryService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Category> getChannels() {
        return categoryService.getAll();
    }
}
