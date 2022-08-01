package com.example.simplerecipeapp.services;

import com.example.simplerecipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
