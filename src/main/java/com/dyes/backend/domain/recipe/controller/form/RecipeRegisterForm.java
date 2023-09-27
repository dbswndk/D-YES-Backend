package com.dyes.backend.domain.recipe.controller.form;

import com.dyes.backend.domain.recipe.service.request.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecipeRegisterForm {

    private String userToken;
    private RecipeRegisterRequest recipeRegisterRequest;
    private RecipeContentRegisterRequest recipeContentRegisterRequest;
    private RecipeCategoryRegisterRequest recipeCategoryRegisterRequest;
    private RecipeIngredientRegisterRequest recipeIngredientRegisterRequest;
    private RecipeMainImageRegisterRequest recipeMainImageRegisterRequest;
}
