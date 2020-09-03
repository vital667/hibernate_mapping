package hibernate_homework.controller;

import hibernate_homework.repo.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/categories")
    public String getCategories(ModelMap map){
        map.put("categories",categoryRepository.findAll());
        return "categories";
    }
}
