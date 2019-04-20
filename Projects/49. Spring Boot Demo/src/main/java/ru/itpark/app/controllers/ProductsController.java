package ru.itpark.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.itpark.app.models.Product;
import ru.itpark.app.services.ProductsService;

import java.util.List;

@Controller
@RequestMapping(value = "/products")
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @GetMapping
    public String getProductsPage(ModelMap model) {
        List<Product> products = productsService.getProducts();
        model.addAttribute("products", products);
        return "products";
    }

    @PostMapping
    public String addProduct(Product product) {
        productsService.add(product);
        return "redirect:/products";
    }

    @PostMapping("/ajax")
    @ResponseBody
    public List<Product> addProductFromJson(@RequestBody Product product) {
        productsService.add(product);
        return productsService.getProducts();
    }
}
