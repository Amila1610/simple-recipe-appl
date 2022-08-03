package com.example.simplerecipeapp.controllers;

import com.example.simplerecipeapp.domain.Category;
import com.example.simplerecipeapp.domain.UnitOfMeasure;
import com.example.simplerecipeapp.repositories.CategoryRepository;
import com.example.simplerecipeapp.repositories.UnitOfMeasureRepository;
import com.example.simplerecipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;
@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
        public String getIndexPage(Model model){
        log.debug("Getting Index Page");
            model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
