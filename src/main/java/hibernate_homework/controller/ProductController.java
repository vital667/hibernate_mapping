package hibernate_homework.controller;

import hibernate_homework.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("products")
    public String getProducts(ModelMap map) {
        map.put("products",productRepository.findAll());
        return "products";
    }
}
